package com.dmx.evaluationplatform.model.dao;

import com.dmx.evaluationplatform.model.pojo.sceneConfig;

public interface sceneConfigMapper {
    int deleteByPrimaryKey(Long id);

    int insert(sceneConfig record);

    int insertSelective(sceneConfig record);

    sceneConfig selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(sceneConfig record);

    int updateByPrimaryKeyWithBLOBs(sceneConfig record);

    int updateByPrimaryKey(sceneConfig record);
}