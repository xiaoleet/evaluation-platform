package com.dmx.evaluationplatform.model.dao;

import com.dmx.evaluationplatform.model.pojo.evaMetricPackageRelationKey;

public interface evaMetricPackageRelationMapper {
    int deleteByPrimaryKey(evaMetricPackageRelationKey key);

    int insert(evaMetricPackageRelationKey record);

    int insertSelective(evaMetricPackageRelationKey record);
}