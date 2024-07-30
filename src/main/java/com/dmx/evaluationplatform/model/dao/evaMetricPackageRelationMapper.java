package com.dmx.evaluationplatform.model.dao;

import com.dmx.evaluationplatform.model.pojo.EvaMetricPackageRelationExample;
import com.dmx.evaluationplatform.model.pojo.EvaMetricPackageRelationKey;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EvaMetricPackageRelationMapper {
    long countByExample(EvaMetricPackageRelationExample example);

    int deleteByExample(EvaMetricPackageRelationExample example);

    int deleteByPrimaryKey(EvaMetricPackageRelationKey key);

    int insert(EvaMetricPackageRelationKey record);

    int insertSelective(EvaMetricPackageRelationKey record);

    List<EvaMetricPackageRelationKey> selectByExample(EvaMetricPackageRelationExample example);

    int updateByExampleSelective(@Param("record") EvaMetricPackageRelationKey record, @Param("example") EvaMetricPackageRelationExample example);

    int updateByExample(@Param("record") EvaMetricPackageRelationKey record, @Param("example") EvaMetricPackageRelationExample example);
}