package com.dmx.evaluationplatform.service.impl;

import com.dmx.evaluationplatform.model.dao.EvaDataInfoMapper;
import com.dmx.evaluationplatform.model.pojo.EvaDataInfo;
import com.dmx.evaluationplatform.model.pojo.EvaDataInfoExample;
import com.dmx.evaluationplatform.service.EvaDataInfoService;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Component
public class EvaDataInfoServiceImpl implements EvaDataInfoService {
    @Resource
    EvaDataInfoMapper evaDataInfoMapper;
    public List<EvaDataInfo> select (int dataType){
        EvaDataInfoExample example = new EvaDataInfoExample();
        EvaDataInfoExample.Criteria criteria = example.createCriteria();
        criteria.andDataTypeEqualTo(dataType);
        example.setOrderByClause("create_time DESC");
        return evaDataInfoMapper.selectByExample(example);
    }
}
