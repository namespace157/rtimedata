package com.sdjictec.bqdrtime.rtimedata.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;

/**
 * @Author yinxiao
 * @Date 2019/6/14$ 10:27$
 * @Description: 实时数据任务表
 */
@Entity
@Table(name = "rtimeetl_info")
@ApiModel(value = "实时数据任务表", description = "实时数据任务表")
public class RtimeETLInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    @ApiModelProperty("ID")
    private Integer jobID;

    @ApiModelProperty("来源系统")
    @Column(name = "source_id")
    private Integer sourceId;

    @ApiModelProperty("来源表名称")
    @Column(name = "s_tablename")
    private String strSourceTable;

    @ApiModelProperty("来源表时间字段")
    @Column(name = "s_timecolumn")
    private String sourceTimeColumn;

    @ApiModelProperty("来源表字段")
    @Column(name = "s_columns")
    private String sourceColumns;

    @ApiModelProperty("目标表名称")
    @Column(name = "t_tablename")
    private String strTargetTable;

    @ApiModelProperty("任务类型")
    @Column(name = "task_type")
    private int taskType;//0:实时任务;1:批量任务

    @ApiModelProperty("任务状态")
    @Column(name = "task_stat")
    private int taskStat;//0:未执行;1:执行中

    public RtimeETLInfo() {
    }

    public RtimeETLInfo(Integer sourceId, String strSourceTable, String sourceTimeColumn, String sourceColumns, String strTargetTable, int taskType, int taskStat) {
        this.sourceId = sourceId;
        this.strSourceTable = strSourceTable;
        this.sourceTimeColumn = sourceTimeColumn;
        this.sourceColumns = sourceColumns;
        this.strTargetTable = strTargetTable;
        this.taskType = taskType;
        this.taskStat = taskStat;
    }

    public Integer getJobID() {
        return jobID;
    }

    public void setJobID(Integer jobID) {
        this.jobID = jobID;
    }

    public Integer getSourceId() {
        return sourceId;
    }

    public void setSourceId(Integer sourceId) {
        this.sourceId = sourceId;
    }

    public String getStrSourceTable() {
        return strSourceTable;
    }

    public void setStrSourceTable(String strSourceTable) {
        this.strSourceTable = strSourceTable;
    }

    public String getSourceTimeColumn() {
        return sourceTimeColumn;
    }

    public void setSourceTimeColumn(String sourceTimeColumn) {
        this.sourceTimeColumn = sourceTimeColumn;
    }

    public String getSourceColumns() {
        return sourceColumns;
    }

    public void setSourceColumns(String sourceColumns) {
        this.sourceColumns = sourceColumns;
    }

    public String getStrTargetTable() {
        return strTargetTable;
    }

    public void setStrTargetTable(String strTargetTable) {
        this.strTargetTable = strTargetTable;
    }

    public int getTaskType() {
        return taskType;
    }

    public void setTaskType(int taskType) {
        this.taskType = taskType;
    }

    public int getTaskStat() {
        return taskStat;
    }

    public void setTaskStat(int taskStat) {
        this.taskStat = taskStat;
    }
}
