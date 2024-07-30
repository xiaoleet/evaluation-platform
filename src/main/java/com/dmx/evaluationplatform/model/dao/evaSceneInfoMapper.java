package com.dmx.evaluationplatform.model.dao;

import com.dmx.evaluationplatform.model.pojo.EvaSceneInfo;

public interface EvaSceneInfoMapper {
    int deleteByPrimaryKey(Long sceneId);

    int insert(EvaSceneInfo record);

    int insertSelective(EvaSceneInfo record);

    EvaSceneInfo selectByPrimaryKey(Long sceneId);

    int updateByPrimaryKeySelective(EvaSceneInfo record);

    int updateByPrimaryKey(EvaSceneInfo record);
}