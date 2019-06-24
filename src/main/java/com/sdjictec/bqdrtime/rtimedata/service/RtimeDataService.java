package com.sdjictec.bqdrtime.rtimedata.service;

import com.sdjictec.bqdrtime.rtimedata.entity.RtimeETLInfo;
import com.sdjictec.bqdrtime.rtimedata.entity.SystemInfo;

import java.util.List;

/**
 *
 */
public interface RtimeDataService {
    //获取系统信息
    List<SystemInfo> getSystemDB();
    //添加实时抽数任务
    int saveRtimeETLTask(RtimeETLInfo rtimeETLInfo);
    //添加批量抽数任务
    int saveBatchETLTask(RtimeETLInfo rtimeETLInfo);
}
