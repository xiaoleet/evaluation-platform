package com.dmx.evaluationplatform.util;

import com.dmx.evaluationplatform.config.Constant;
import com.dmx.evaluationplatform.model.domain.Result;
import com.dmx.evaluationplatform.model.pojo.CsvInfo;
import com.dmx.evaluationplatform.service.impl.EvaDataServiceImpl;
import org.apache.commons.io.input.BOMInputStream;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import com.csvreader.CsvReader;
public class FileCheckUtil {
    private final static Logger logger = LoggerFactory.getLogger(FileCheckUtil.class);

    public static boolean checkFileName(String fileName){
        String[] illegalStrs = new String[]{"*", "`"};
        for(String illegalStr:illegalStrs){
            if(fileName.contains(illegalStr)){
                return false;
            }
        }
        return true;
    }

    public static boolean checkFileSuffix(String fileName, Constant.DATATYPE dataType){
        String suffix = fileName.substring(fileName.lastIndexOf(".")+1);
        if("".equals(dataType.getSuffix())){
            return false;
        }
        return dataType.getSuffix().equals(suffix);
    }

    public static Result checkCsvFile(InputStream bomIn,InputStream csvIn,int checkLine){
        BOMInputStream bomInputStream = new BOMInputStream(bomIn);
        try{
            //获取完bom头以后，将pos回归到头部，便于后面处理文件流
            if (bomInputStream.hasBOM()){
                return new Result(true,"CSV文件中含有BOM文件，将导致文件无法正常读取，请使用文本编辑器修改编码格式为UTF-8(不要使用excel)");
            }
        }catch (IOException e){
            logger.error(e.getMessage(),e);
            return new Result(true,String.format("读取文件，检查是否含有bom头时发生异常"));
        }finally {
            //如果发生异常，不能让打开的文件一直占着内存，所以需要关闭文件；否则继续对文件流做处理
            try{
                bomInputStream.close();
            }catch (Exception e){
                logger.error( e.getMessage(),e);
            }
        }

        //包装成csvReader流
        CsvReader csvReader = new CsvReader(new InputStreamReader(csvIn));
        if(csvReader == null){
            return new Result(true,"文件不存在!");
        }
        try{
            //都取csv的文件收首部，获取首部列数
            if(!csvReader.readHeaders()){
                return new Result(true,"空文件不能上传!");
            }
            int count = csvReader.getHeaders().length;//获取header的长度，也就是csv列长
            int line = 2;//从第二行读起，第一行是header
            //遍历csv的每一行
            while (csvReader.readRecord()){
                //文件大小大雨200M时，只检测前200行 todo:200M没有做检查
                if(checkLine > 0 && line > checkLine){
                    break;
                }
                boolean flag = checkCvsRecord(csvReader,count);
                if(!flag) {
                    return new Result(false,String.format("文件第%s{}行数据格式有错误",line));
                }
                line++;
            }
            if(line == 2){
                return new Result(false,"文件内容为空!");
            }
        }catch (IOException e){
            logger.error(e.getMessage(),e);
            return new Result(false,"检查文件内容时发生异常");
        }
        return new Result(true,"检查文件内容通过！");
    }

    //check csv文件的列数和header的长度相等以及内容不要为空
    public static boolean checkCvsRecord(CsvReader csvReader,int headCount){
        return csvReader.getColumnCount() == headCount;
    }
}
