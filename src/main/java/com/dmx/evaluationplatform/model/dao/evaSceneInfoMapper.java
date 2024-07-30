package com.dmx.evaluationplatform.model.dao;

import com.dmx.evaluationplatform.model.pojo.evaSceneInfo;

public interface evaSceneInfoMapper {
    int deleteByPrimaryKey(Long sceneId);

    int insert(evaSceneInfo record);

    int insertSelective(evaSceneInfo record);

    evaSceneInfo selectByPrimaryKey(Long sceneId);

    int updateByPrimaryKeySelective(evaSceneInfo record);

    int updateByPrimaryKey(evaSceneInfo record);
}