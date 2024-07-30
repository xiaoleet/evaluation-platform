package com.dmx.evaluationplatform.service;

import com.dmx.evaluationplatform.model.pojo.EvaDataInfo;
import com.dmx.evaluationplatform.model.pojo.EvaDataInfoExample;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Component
public interface EvaDataInfoService {
    public List<EvaDataInfo> select (int dataType);
}
