package com.sdjictec.bqdrtime.rtimedata.dao;

import com.sdjictec.bqdrtime.rtimedata.entity.SystemInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

/**
 * @Author yinxiao
 * @Date 2019/6/13$ 14:28$
 * @Description:
 */
public interface SystemInfoDao extends JpaRepository<SystemInfo, Integer>, JpaSpecificationExecutor<SystemInfo> {
    @Query("from SystemInfo where intIsDel=0")
    List<SystemInfo> findSystemInfo();
}
