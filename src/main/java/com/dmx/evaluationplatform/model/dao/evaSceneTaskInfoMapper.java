package com.dmx.evaluationplatform.model.dao;

import com.dmx.evaluationplatform.model.pojo.EvaSceneTaskInfo;
import com.dmx.evaluationplatform.model.pojo.EvaSceneTaskInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EvaSceneTaskInfoMapper {
    long countByExample(EvaSceneTaskInfoExample example);

    int deleteByExample(EvaSceneTaskInfoExample example);

    int deleteByPrimaryKey(Long sceneTaskId);

    int insert(EvaSceneTaskInfo record);

    int insertSelective(EvaSceneTaskInfo record);

    List<EvaSceneTaskInfo> selectByExample(EvaSceneTaskInfoExample example);

    EvaSceneTaskInfo selectByPrimaryKey(Long sceneTaskId);

    int updateByExampleSelective(@Param("record") EvaSceneTaskInfo record, @Param("example") EvaSceneTaskInfoExample example);

    int updateByExample(@Param("record") EvaSceneTaskInfo record, @Param("example") EvaSceneTaskInfoExample example);

    int updateByPrimaryKeySelective(EvaSceneTaskInfo record);

    int updateByPrimaryKey(EvaSceneTaskInfo record);
}