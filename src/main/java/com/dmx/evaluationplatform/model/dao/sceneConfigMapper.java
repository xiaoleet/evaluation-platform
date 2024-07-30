package com.dmx.evaluationplatform.model.dao;

import com.dmx.evaluationplatform.model.pojo.SceneConfig;
import com.dmx.evaluationplatform.model.pojo.SceneConfigExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SceneConfigMapper {
    long countByExample(SceneConfigExample example);

    int deleteByExample(SceneConfigExample example);

    int deleteByPrimaryKey(Long id);

    int insert(SceneConfig record);

    int insertSelective(SceneConfig record);

    List<SceneConfig> selectByExampleWithBLOBs(SceneConfigExample example);

    List<SceneConfig> selectByExample(SceneConfigExample example);

    SceneConfig selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") SceneConfig record, @Param("example") SceneConfigExample example);

    int updateByExampleWithBLOBs(@Param("record") SceneConfig record, @Param("example") SceneConfigExample example);

    int updateByExample(@Param("record") SceneConfig record, @Param("example") SceneConfigExample example);

    int updateByPrimaryKeySelective(SceneConfig record);

    int updateByPrimaryKeyWithBLOBs(SceneConfig record);

    int updateByPrimaryKey(SceneConfig record);
}