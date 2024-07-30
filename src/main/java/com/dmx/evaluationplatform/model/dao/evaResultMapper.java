package com.dmx.evaluationplatform.model.dao;

import com.dmx.evaluationplatform.model.pojo.EvaResult;
import com.dmx.evaluationplatform.model.pojo.EvaResultExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EvaResultMapper {
    long countByExample(EvaResultExample example);

    int deleteByExample(EvaResultExample example);

    int deleteByPrimaryKey(Long id);

    int insert(EvaResult record);

    int insertSelective(EvaResult record);

    List<EvaResult> selectByExample(EvaResultExample example);

    EvaResult selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") EvaResult record, @Param("example") EvaResultExample example);

    int updateByExample(@Param("record") EvaResult record, @Param("example") EvaResultExample example);

    int updateByPrimaryKeySelective(EvaResult record);

    int updateByPrimaryKey(EvaResult record);
}