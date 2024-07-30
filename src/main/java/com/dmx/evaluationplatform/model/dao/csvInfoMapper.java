package com.dmx.evaluationplatform.model.dao;

import com.dmx.evaluationplatform.model.pojo.CsvInfo;

public interface CsvInfoMapper {
    int deleteByPrimaryKey(Long csvInfoId);

    int insert(CsvInfo record);

    int insertSelective(CsvInfo record);

    CsvInfo selectByPrimaryKey(Long csvInfoId);

    int updateByPrimaryKeySelective(CsvInfo record);

    int updateByPrimaryKeyWithBLOBs(CsvInfo record);

    int updateByPrimaryKey(CsvInfo record);
}