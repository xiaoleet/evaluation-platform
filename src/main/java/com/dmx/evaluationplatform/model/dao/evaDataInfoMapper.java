package com.dmx.evaluationplatform.model.dao;

import com.dmx.evaluationplatform.model.pojo.EvaDataInfo;
import com.dmx.evaluationplatform.model.pojo.EvaDataInfoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EvaDataInfoMapper {
    long countByExample(EvaDataInfoExample example);

    int deleteByExample(EvaDataInfoExample example);

    int deleteByPrimaryKey(Long evaDataId);

    int insert(EvaDataInfo record);

    int insertSelective(EvaDataInfo record);

    List<EvaDataInfo> selectByExampleWithBLOBs(EvaDataInfoExample example);

    List<EvaDataInfo> selectByExample(EvaDataInfoExample example);

    EvaDataInfo selectByPrimaryKey(Long evaDataId);

    int updateByExampleSelective(@Param("record") EvaDataInfo record, @Param("example") EvaDataInfoExample example);

    int updateByExampleWithBLOBs(@Param("record") EvaDataInfo record, @Param("example") EvaDataInfoExample example);

    int updateByExample(@Param("record") EvaDataInfo record, @Param("example") EvaDataInfoExample example);

    int updateByPrimaryKeySelective(EvaDataInfo record);

    int updateByPrimaryKeyWithBLOBs(EvaDataInfo record);

    int updateByPrimaryKey(EvaDataInfo record);
}