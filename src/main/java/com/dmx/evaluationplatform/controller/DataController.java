package com.dmx.evaluationplatform.controller;

import com.dmx.evaluationplatform.config.Constant;
import com.dmx.evaluationplatform.dto.Response;
import com.dmx.evaluationplatform.model.pojo.EvaDataInfo;
import com.dmx.evaluationplatform.service.EvaDataInfoService;
import com.dmx.evaluationplatform.service.impl.EvaDataInfoServiceImpl;
import com.dmx.evaluationplatform.service.impl.EvaDataServiceImpl;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;


@RestController
@RequestMapping("/api/data")
public class DataController {
    @Autowired
    EvaDataServiceImpl evaDataService;
    @Autowired
    EvaDataInfoServiceImpl evaDataInfoService;

    @RequestMapping( value = "/getEvaDataInfos",method = {RequestMethod.GET,RequestMethod.OPTIONS})
    @ResponseBody
    public Response<PageInfo<EvaDataInfo>> getDataInfoList(
            @RequestParam(value = "dataType") Integer dataType,
            @RequestParam(value = "page") Integer page,
            @RequestParam(value = "pageSize") Integer pageSize
    ){
        PageHelper.startPage(page,pageSize);
        List<EvaDataInfo> evaDataInfos = evaDataInfoService.select(dataType);
        PageInfo<EvaDataInfo> pageInfo = new PageInfo<>(evaDataInfos);
        Response<PageInfo<EvaDataInfo>> response = new Response<>();
        response.setData(pageInfo);
        response.setStatus(Constant.STATUS.SUCCESS);
        return response;
    }
}
