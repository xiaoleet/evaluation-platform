package com.dmx.evaluationplatform.model.dao;

import com.dmx.evaluationplatform.model.pojo.EvaMetricInfo;
import com.dmx.evaluationplatform.model.pojo.EvaMetricInfoExample;
import com.dmx.evaluationplatform.model.pojo.EvaMetricInfoWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EvaMetricInfoMapper {
    long countByExample(EvaMetricInfoExample example);

    int deleteByExample(EvaMetricInfoExample example);

    int deleteByPrimaryKey(Long evaMetricId);

    int insert(EvaMetricInfoWithBLOBs record);

    int insertSelective(EvaMetricInfoWithBLOBs record);

    List<EvaMetricInfoWithBLOBs> selectByExampleWithBLOBs(EvaMetricInfoExample example);

    List<EvaMetricInfo> selectByExample(EvaMetricInfoExample example);

    EvaMetricInfoWithBLOBs selectByPrimaryKey(Long evaMetricId);

    int updateByExampleSelective(@Param("record") EvaMetricInfoWithBLOBs record, @Param("example") EvaMetricInfoExample example);

    int updateByExampleWithBLOBs(@Param("record") EvaMetricInfoWithBLOBs record, @Param("example") EvaMetricInfoExample example);

    int updateByExample(@Param("record") EvaMetricInfo record, @Param("example") EvaMetricInfoExample example);

    int updateByPrimaryKeySelective(EvaMetricInfoWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(EvaMetricInfoWithBLOBs record);

    int updateByPrimaryKey(EvaMetricInfo record);
}