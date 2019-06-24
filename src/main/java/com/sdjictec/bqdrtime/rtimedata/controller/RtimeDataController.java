package com.sdjictec.bqdrtime.rtimedata.controller;

import com.google.gson.Gson;
import com.sdjictec.bqdrtime.rtimedata.entity.RtimeETLInfo;
import com.sdjictec.bqdrtime.rtimedata.entity.SystemInfo;
import com.sdjictec.bqdrtime.rtimedata.service.RtimeDataService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author yinxiao
 * @Date 2019/6/13 9:35
 * @Description:  实时数据
 */
@RestController
@RequestMapping(value = "/rtimedata")
public class RtimeDataController {
    @Autowired
    private RtimeDataService rtimeDataService;

    @Autowired
    private Gson gson;

    @RequestMapping(value = "/getSystemDB",method = RequestMethod.GET)
    @ResponseBody
    @ApiOperation(value = "获取来源系统信息", notes = "")
    public List<SystemInfo> getSystemDB(){
        System.out.println("*************获取来源系统信息*************");
        List<SystemInfo> resultList = rtimeDataService.getSystemDB();
        return resultList;
    }

    @RequestMapping(value = "/saveRtimeETLTask",method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation(value = "添加实时抽数任务", notes = "")
    public String saveRtimeETLTask(@RequestBody String json){
        System.out.println("*******添加实时抽数任务**********");
        System.out.println("*********************"+json);
        String result = "";
        RtimeETLInfo rtimeETLInfo = gson.fromJson(json,RtimeETLInfo.class);
        rtimeETLInfo.setTaskType(0);//实时任务为0
        int status = rtimeDataService.saveRtimeETLTask(rtimeETLInfo);
        if (status == 1) {
            result = "添加成功！";
        } else {
            result = "该任务已经存在！";
        }
        return result;
    }

    @RequestMapping(value = "/saveBatchETLTask",method = RequestMethod.POST)
    @ResponseBody
    @ApiOperation(value = "添加批量抽数任务", notes = "")
    public String saveBatchETLTask(@RequestBody String json){
        System.out.println("*******添加批量抽数任务**********");
        System.out.println("*********************"+json);
        String result = "";
        RtimeETLInfo rtimeETLInfo = gson.fromJson(json,RtimeETLInfo.class);
        rtimeETLInfo.setTaskType(1);//批量任务为1
        rtimeETLInfo.setTaskStat(0);//未执行为0
        int status = rtimeDataService.saveBatchETLTask(rtimeETLInfo);
        if (status == 1) {
            result = "添加成功！";
        } else {
            result = "该任务已经存在！";
        }
        return result;
    }
}
