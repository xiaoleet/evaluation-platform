package com.dmx.evaluationplatform.model.dao;

import com.dmx.evaluationplatform.model.pojo.SceneConfig;

public interface SceneConfigMapper {
    int deleteByPrimaryKey(Long id);

    int insert(SceneConfig record);

    int insertSelective(SceneConfig record);

    SceneConfig selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(SceneConfig record);

    int updateByPrimaryKeyWithBLOBs(SceneConfig record);

    int updateByPrimaryKey(SceneConfig record);
}