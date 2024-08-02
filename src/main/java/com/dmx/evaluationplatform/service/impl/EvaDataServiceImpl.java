package com.dmx.evaluationplatform.service.impl;

import com.dmx.evaluationplatform.config.Constant;
import com.dmx.evaluationplatform.model.domain.Result;
import com.dmx.evaluationplatform.service.EvaDataService;
import com.dmx.evaluationplatform.util.FileCheckUtil;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import org.slf4j.Logger;

@Component
public class EvaDataServiceImpl implements EvaDataService {

    private final static Logger logger = LoggerFactory.getLogger(EvaDataServiceImpl.class);

    public Result checkFileNameAndType(MultipartFile file, Integer dataType){
        Constant.DATATYPE type = Constant.DATATYPE.findByValue(dataType);
        String originName = file.getOriginalFilename();
        //使用 == 运算符：枚举常量是唯一的，并且在运行时是单例的，因此可以安全地使用 == 运算符来比较它们的引用是否相同。
        if(type ==Constant.DATATYPE.INVALID_DATA_TYPE){
            return new Result(true,"上传的文件后缀名不合法!");
        }

        if(!FileCheckUtil.checkFileName(originName)){
            return new Result(true,"上传的文件名中不得含有特殊符号`和*");

        }

        if(!FileCheckUtil.checkFileSuffix(originName,type)){
            return new Result(false,"上传的文件后缀名不正确，必须为"+type.getSuffix()+"格式");

        }
        return new Result(false,"文件名和类型检查通过！");
    }

    public Result checkFileSize(MultipartFile file){
        long fileSize = file.getSize();
        if(fileSize == 0 || file.isEmpty()){
            return  new Result(true,"上传文件不能为空!");
        }
        if(fileSize > Constant.MaxFileSize){//前端提示只允许10GB以内，后端实际扩展到15GB
            return  new Result(true,"上传超出限制！");
        }
        return  new Result(false,"文件大小检查通过！");
    }

    public Result checkFilePreLine(MultipartFile file,int type){
        long startTime =  System.currentTimeMillis();
        int checkLine = 200;//只检查前200行的内容
        try{
            if(type == Constant.DATATYPE.CUSTOM.getDataType()){
                //inputStream不能循环读取，这里要获取两次inputStream
                InputStream bomIm = file.getInputStream();
                InputStream in = file.getInputStream();
                return FileCheckUtil.checkCsvFile(bomIm,in,checkLine);
            }
        }catch (IOException e){
            logger.error(e.getMessage(),e);
            return new Result(true,"文件读取错误，原因是"+e.getMessage());
        }finally {
            long endTime = System.currentTimeMillis();
            logger.info("文件名: {}, 文件大小: {} bytes, 检测总耗时(ms): {}", file.getOriginalFilename(), file.getSize(), (endTime-startTime));
        }


        return  new Result(false,"文件大小检查通过！");
    }
}
