package com.dmx.evaluationplatform.model.dao;

import com.dmx.evaluationplatform.model.pojo.EvaMetricPackageRelationKey;

public interface EvaMetricPackageRelationMapper {
    int deleteByPrimaryKey(EvaMetricPackageRelationKey key);

    int insert(EvaMetricPackageRelationKey record);

    int insertSelective(EvaMetricPackageRelationKey record);
}