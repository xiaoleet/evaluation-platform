package com.dmx.evaluationplatform.model.dao;

import com.dmx.evaluationplatform.model.pojo.evaMetricInfo;
import com.dmx.evaluationplatform.model.pojo.evaMetricInfoWithBLOBs;

public interface evaMetricInfoMapper {
    int deleteByPrimaryKey(Long evaMetricId);

    int insert(evaMetricInfoWithBLOBs record);

    int insertSelective(evaMetricInfoWithBLOBs record);

    evaMetricInfoWithBLOBs selectByPrimaryKey(Long evaMetricId);

    int updateByPrimaryKeySelective(evaMetricInfoWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(evaMetricInfoWithBLOBs record);

    int updateByPrimaryKey(evaMetricInfo record);
}