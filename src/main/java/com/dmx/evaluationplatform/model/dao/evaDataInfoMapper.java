package com.dmx.evaluationplatform.model.dao;

import com.dmx.evaluationplatform.model.pojo.EvaDataInfo;

public interface EvaDataInfoMapper {
    int deleteByPrimaryKey(Long evaDataId);

    int insert(EvaDataInfo record);

    int insertSelective(EvaDataInfo record);

    EvaDataInfo selectByPrimaryKey(Long evaDataId);

    int updateByPrimaryKeySelective(EvaDataInfo record);

    int updateByPrimaryKeyWithBLOBs(EvaDataInfo record);

    int updateByPrimaryKey(EvaDataInfo record);
}