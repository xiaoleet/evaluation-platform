package com.dmx.evaluationplatform.model.dao;

import com.dmx.evaluationplatform.model.pojo.EvaMetricPackageInfo;
import com.dmx.evaluationplatform.model.pojo.EvaMetricPackageInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EvaMetricPackageInfoMapper {
    long countByExample(EvaMetricPackageInfoExample example);

    int deleteByExample(EvaMetricPackageInfoExample example);

    int deleteByPrimaryKey(Long evaPackageId);

    int insert(EvaMetricPackageInfo record);

    int insertSelective(EvaMetricPackageInfo record);

    List<EvaMetricPackageInfo> selectByExample(EvaMetricPackageInfoExample example);

    EvaMetricPackageInfo selectByPrimaryKey(Long evaPackageId);

    int updateByExampleSelective(@Param("record") EvaMetricPackageInfo record, @Param("example") EvaMetricPackageInfoExample example);

    int updateByExample(@Param("record") EvaMetricPackageInfo record, @Param("example") EvaMetricPackageInfoExample example);

    int updateByPrimaryKeySelective(EvaMetricPackageInfo record);

    int updateByPrimaryKey(EvaMetricPackageInfo record);
}