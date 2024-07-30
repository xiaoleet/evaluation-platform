package com.dmx.evaluationplatform.model.dao;

import com.dmx.evaluationplatform.model.pojo.CsvInfo;
import com.dmx.evaluationplatform.model.pojo.CsvInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CsvInfoMapper {
    long countByExample(CsvInfoExample example);

    int deleteByExample(CsvInfoExample example);

    int deleteByPrimaryKey(Long csvInfoId);

    int insert(CsvInfo record);

    int insertSelective(CsvInfo record);

    List<CsvInfo> selectByExampleWithBLOBs(CsvInfoExample example);

    List<CsvInfo> selectByExample(CsvInfoExample example);

    CsvInfo selectByPrimaryKey(Long csvInfoId);

    int updateByExampleSelective(@Param("record") CsvInfo record, @Param("example") CsvInfoExample example);

    int updateByExampleWithBLOBs(@Param("record") CsvInfo record, @Param("example") CsvInfoExample example);

    int updateByExample(@Param("record") CsvInfo record, @Param("example") CsvInfoExample example);

    int updateByPrimaryKeySelective(CsvInfo record);

    int updateByPrimaryKeyWithBLOBs(CsvInfo record);

    int updateByPrimaryKey(CsvInfo record);
}