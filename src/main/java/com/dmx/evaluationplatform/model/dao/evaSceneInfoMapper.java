package com.dmx.evaluationplatform.model.dao;

import com.dmx.evaluationplatform.model.pojo.EvaSceneInfo;
import com.dmx.evaluationplatform.model.pojo.EvaSceneInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EvaSceneInfoMapper {
    long countByExample(EvaSceneInfoExample example);

    int deleteByExample(EvaSceneInfoExample example);

    int deleteByPrimaryKey(Long sceneId);

    int insert(EvaSceneInfo record);

    int insertSelective(EvaSceneInfo record);

    List<EvaSceneInfo> selectByExample(EvaSceneInfoExample example);

    EvaSceneInfo selectByPrimaryKey(Long sceneId);

    int updateByExampleSelective(@Param("record") EvaSceneInfo record, @Param("example") EvaSceneInfoExample example);

    int updateByExample(@Param("record") EvaSceneInfo record, @Param("example") EvaSceneInfoExample example);

    int updateByPrimaryKeySelective(EvaSceneInfo record);

    int updateByPrimaryKey(EvaSceneInfo record);
}