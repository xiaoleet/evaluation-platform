package com.dmx.evaluationplatform.model.dao;

import com.dmx.evaluationplatform.model.pojo.csvInfo;

public interface csvInfoMapper {
    int deleteByPrimaryKey(Long csvInfoId);

    int insert(csvInfo record);

    int insertSelective(csvInfo record);

    csvInfo selectByPrimaryKey(Long csvInfoId);

    int updateByPrimaryKeySelective(csvInfo record);

    int updateByPrimaryKeyWithBLOBs(csvInfo record);

    int updateByPrimaryKey(csvInfo record);
}