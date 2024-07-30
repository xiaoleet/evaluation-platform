package com.dmx.evaluationplatform.model.dao;

import com.dmx.evaluationplatform.model.pojo.evaDataInfo;

public interface evaDataInfoMapper {
    int deleteByPrimaryKey(Long evaDataId);

    int insert(evaDataInfo record);

    int insertSelective(evaDataInfo record);

    evaDataInfo selectByPrimaryKey(Long evaDataId);

    int updateByPrimaryKeySelective(evaDataInfo record);

    int updateByPrimaryKeyWithBLOBs(evaDataInfo record);

    int updateByPrimaryKey(evaDataInfo record);
}