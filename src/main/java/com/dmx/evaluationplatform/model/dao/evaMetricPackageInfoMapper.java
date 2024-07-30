package com.dmx.evaluationplatform.model.dao;

import com.dmx.evaluationplatform.model.pojo.evaMetricPackageInfo;

public interface evaMetricPackageInfoMapper {
    int deleteByPrimaryKey(Long evaPackageId);

    int insert(evaMetricPackageInfo record);

    int insertSelective(evaMetricPackageInfo record);

    evaMetricPackageInfo selectByPrimaryKey(Long evaPackageId);

    int updateByPrimaryKeySelective(evaMetricPackageInfo record);

    int updateByPrimaryKey(evaMetricPackageInfo record);
}