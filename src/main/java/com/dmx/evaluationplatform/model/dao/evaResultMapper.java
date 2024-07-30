package com.dmx.evaluationplatform.model.dao;

import com.dmx.evaluationplatform.model.pojo.EvaResult;

public interface EvaResultMapper {
    int deleteByPrimaryKey(Long id);

    int insert(EvaResult record);

    int insertSelective(EvaResult record);

    EvaResult selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(EvaResult record);

    int updateByPrimaryKey(EvaResult record);
}