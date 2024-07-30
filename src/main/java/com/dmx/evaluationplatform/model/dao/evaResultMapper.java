package com.dmx.evaluationplatform.model.dao;

import com.dmx.evaluationplatform.model.pojo.evaResult;

public interface evaResultMapper {
    int deleteByPrimaryKey(Long id);

    int insert(evaResult record);

    int insertSelective(evaResult record);

    evaResult selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(evaResult record);

    int updateByPrimaryKey(evaResult record);
}