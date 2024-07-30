package com.dmx.evaluationplatform.model.dao;

import com.dmx.evaluationplatform.model.pojo.EvaMetricPackageInfo;

public interface EvaMetricPackageInfoMapper {
    int deleteByPrimaryKey(Long evaPackageId);

    int insert(EvaMetricPackageInfo record);

    int insertSelective(EvaMetricPackageInfo record);

    EvaMetricPackageInfo selectByPrimaryKey(Long evaPackageId);

    int updateByPrimaryKeySelective(EvaMetricPackageInfo record);

    int updateByPrimaryKey(EvaMetricPackageInfo record);
}