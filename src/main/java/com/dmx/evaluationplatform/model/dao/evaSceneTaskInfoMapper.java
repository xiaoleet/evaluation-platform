package com.dmx.evaluationplatform.model.dao;

import com.dmx.evaluationplatform.model.pojo.evaSceneTaskInfo;

public interface evaSceneTaskInfoMapper {
    int deleteByPrimaryKey(Long sceneTaskId);

    int insert(evaSceneTaskInfo record);

    int insertSelective(evaSceneTaskInfo record);

    evaSceneTaskInfo selectByPrimaryKey(Long sceneTaskId);

    int updateByPrimaryKeySelective(evaSceneTaskInfo record);

    int updateByPrimaryKey(evaSceneTaskInfo record);
}