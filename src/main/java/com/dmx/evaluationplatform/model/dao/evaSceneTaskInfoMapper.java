package com.dmx.evaluationplatform.model.dao;

import com.dmx.evaluationplatform.model.pojo.EvaSceneTaskInfo;

public interface EvaSceneTaskInfoMapper {
    int deleteByPrimaryKey(Long sceneTaskId);

    int insert(EvaSceneTaskInfo record);

    int insertSelective(EvaSceneTaskInfo record);

    EvaSceneTaskInfo selectByPrimaryKey(Long sceneTaskId);

    int updateByPrimaryKeySelective(EvaSceneTaskInfo record);

    int updateByPrimaryKey(EvaSceneTaskInfo record);
}