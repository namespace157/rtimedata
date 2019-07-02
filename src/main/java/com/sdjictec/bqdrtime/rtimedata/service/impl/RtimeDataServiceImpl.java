package com.sdjictec.bqdrtime.rtimedata.service.impl;

import com.sdjictec.bqdrtime.rtimedata.utils.OffLineRuntime;
import com.sdjictec.bqdrtime.rtimedata.dao.RtimeETLInfoDao;
import com.sdjictec.bqdrtime.rtimedata.dao.SystemInfoDao;
import com.sdjictec.bqdrtime.rtimedata.entity.RtimeETLInfo;
import com.sdjictec.bqdrtime.rtimedata.entity.SystemInfo;
import com.sdjictec.bqdrtime.rtimedata.service.RtimeDataService;
import com.sdjictec.flow.RealTimeExtractAS400ElasticSearch;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class RtimeDataServiceImpl implements RtimeDataService {
    @Autowired
    private SystemInfoDao systemInfoDao;

    @Autowired
    private RtimeETLInfoDao rtimeETLInfoDao;

    @Override
    public List<SystemInfo> getSystemDB() {
        return systemInfoDao.findSystemInfo();
    }

    @Override
    @Transactional(rollbackFor = {Exception.class})
    public int saveRtimeETLTask(RtimeETLInfo rtimeETLInfo) {
        //根据传入的参数查询任务信息
        RtimeETLInfo result = rtimeETLInfoDao.findRtimeETLInfoByParams(rtimeETLInfo);

        if (result == null){
            rtimeETLInfoDao.saveAndFlush(rtimeETLInfo);
            int jobId = rtimeETLInfo.getJobID();
            int taskType = rtimeETLInfo.getTaskType();
            if(taskType == 0){//判断离线和实时
                RealTimeExtractAS400ElasticSearch.start(jobId);
            }else{
                String index_type = rtimeETLInfo.getStrTargetTable();
                OffLineRuntime.clearType(index_type);
                OffLineRuntime.runOffLine(jobId);
            }
            return 1;
        }
        return 0;
    }

    @Override
    public int saveBatchETLTask(RtimeETLInfo rtimeETLInfo) {
        //根据传入的参数查询任务信息
        RtimeETLInfo result = rtimeETLInfoDao.findRtimeETLInfoByParams(rtimeETLInfo);
        if (result == null){
            rtimeETLInfoDao.saveAndFlush(rtimeETLInfo);
            return 1;
        }
        return 0;
    }
}
