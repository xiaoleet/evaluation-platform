package com.dmx.evaluationplatform.model.dao;

import com.dmx.evaluationplatform.model.pojo.EvaMetricInfo;
import com.dmx.evaluationplatform.model.pojo.EvaMetricInfoWithBLOBs;

public interface EvaMetricInfoMapper {
    int deleteByPrimaryKey(Long evaMetricId);

    int insert(EvaMetricInfoWithBLOBs record);

    int insertSelective(EvaMetricInfoWithBLOBs record);

    EvaMetricInfoWithBLOBs selectByPrimaryKey(Long evaMetricId);

    int updateByPrimaryKeySelective(EvaMetricInfoWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(EvaMetricInfoWithBLOBs record);

    int updateByPrimaryKey(EvaMetricInfo record);
}