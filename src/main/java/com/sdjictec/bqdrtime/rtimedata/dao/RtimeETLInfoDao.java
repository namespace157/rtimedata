package com.sdjictec.bqdrtime.rtimedata.dao;

import com.sdjictec.bqdrtime.rtimedata.entity.RtimeETLInfo;
import com.sdjictec.bqdrtime.rtimedata.entity.SystemInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;


/**
 * @Author yinxiao
 * @Date 2019/6/13$ 14:28$
 * @Description:
 */
public interface RtimeETLInfoDao extends JpaRepository<RtimeETLInfo, Integer>, JpaSpecificationExecutor<RtimeETLInfo> {
    @Query("from RtimeETLInfo " +
            "where sourceId = :#{#rtimeETLInfo.sourceId} " +
            "and strSourceTable = :#{#rtimeETLInfo.strSourceTable} " +
            "and strTargetTable = :#{#rtimeETLInfo.strTargetTable}")
    RtimeETLInfo findRtimeETLInfoByParams(@Param("rtimeETLInfo") RtimeETLInfo rtimeETLInfo);
}
