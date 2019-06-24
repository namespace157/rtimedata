package com.sdjictec.bqdrtime.rtimedata.entity;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.sql.Timestamp;

/**
 * @类名: SystemInfo
 * @功能描述: 系统信息类
 * @程序开发者：李立伟
 * @编写日期：2017年10月12日
 */
@Entity
@Table(name = "md_t_sys_info")
@ApiModel(value = "系统信息表", description = "系统信息表")
public class SystemInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    @ApiModelProperty("ID")
    private Integer intID;

    @ApiModelProperty("系统名称")
    @Column(name = "name")
    private String strName;

    @ApiModelProperty("系统描述")
    @Column(name = "\"desc\"")
    private String strDesc;

    @ApiModelProperty("排序字段")
    @Column(name = "sort_index")
    private Integer intSortIndex;

    @ApiModelProperty("系统类型ID")
    @Column(name = "sys_type")
    private Integer intSysType;

    @ApiModelProperty("数据库名称")
    @Column(name = "db_name")
    private String strDBName;

    @ApiModelProperty("系统IP")
    @Column(name = "sys_ip")
    private String strSysIP;

    @ApiModelProperty("系统端口")
    @Column(name = "sys_port")
    private String strSysPort;

    @ApiModelProperty("用户名")
    @Column(name = "sys_user")
    private String strSysUser;

    @ApiModelProperty("密码")
    @Column(name = "sys_password")
    private String strSysPassword;

    @ApiModelProperty("连接字符串")
    @Column(name = "sys_connect")
    private String strSysConnect;

    @ApiModelProperty("数据库名")
    @Column(name = "sys_database")
    private String strSysDatabase;

    @ApiModelProperty("表空间")
    @Column(name = "sys_tablespace")
    private String strSysTableSpace;

    @ApiModelProperty("连接驱动")
    @Column(name = "sys_driver")
    private String strSysDriver;

    @Column(name = "server_id")
    @ApiModelProperty("所属集群ID")
    private Integer intServerID;

    @ApiModelProperty("创建人")
    @Column(name = "create_user_id")
    private Integer intCreateUserID;

    @ApiModelProperty("创建时间")
    @Column(name = "create_time")
    private Timestamp timCreateTime;

    @ApiModelProperty("修改人")
    @Column(name = "update_user_id")
    private Integer intUpdateUserID;

    @ApiModelProperty("修改时间")
    @Column(name = "update_time")
    private Timestamp timUpdateTime;

    @ApiModelProperty("删除标记")
    @Column(name = "is_del")
    private Integer intIsDel;

    @ApiModelProperty("用户组列表")
    @Column(name = "group_list")
    private String strGroupList;

    @ApiModelProperty("授权用户列表")
    @Column(name = "user_list")
    private String strUserList;

    @ApiModelProperty("非授权用户列表")
    @Column(name = "out_user_list")
    private String strOutUserList;

    public String getStrGroupList() {
        return strGroupList;
    }

    public void setStrGroupList(String strGroupList) {
        this.strGroupList = strGroupList;
    }

    public String getStrUserList() {
        return strUserList;
    }

    public void setStrUserList(String strUserList) {
        this.strUserList = strUserList;
    }

    public String getStrOutUserList() {
        return strOutUserList;
    }

    public void setStrOutUserList(String strOutUserList) {
        this.strOutUserList = strOutUserList;
    }

    public Integer getIntServerID() {
        return intServerID;
    }

    public void setIntServerID(Integer intServerID) {
        this.intServerID = intServerID;
    }

    public String getStrDBName() {
        return strDBName;
    }

    public void setStrDBName(String strDBName) {
        this.strDBName = strDBName;
    }

    public String getStrSysIP() {
        return strSysIP;
    }

    public void setStrSysIP(String strSysIP) {
        this.strSysIP = strSysIP;
    }

    public String getStrSysPort() {
        return strSysPort;
    }

    public void setStrSysPort(String strSysPort) {
        this.strSysPort = strSysPort;
    }

    public String getStrSysDatabase() {
        return strSysDatabase;
    }

    public void setStrSysDatabase(String strSysDatabase) {
        this.strSysDatabase = strSysDatabase;
    }

    public String getStrSysTableSpace() {
        return strSysTableSpace;
    }

    public void setStrSysTableSpace(String strSysTableSpace) {
        this.strSysTableSpace = strSysTableSpace;
    }

    public Integer getIntID() {
        return intID;
    }

    public void setIntID(Integer intID) {
        this.intID = intID;
    }

    public String getStrName() {
        return strName;
    }

    public void setStrName(String strName) {
        this.strName = strName;
    }

    public String getStrDesc() {
        return strDesc;
    }

    public void setStrDesc(String strDesc) {
        this.strDesc = strDesc;
    }

    public Timestamp getTimUpdateTime() {
        return timUpdateTime;
    }

    public void setTimUpdateTime(Timestamp timUpdateTime) {
        this.timUpdateTime = timUpdateTime;
    }

    public Integer getIntIsDel() {
        return intIsDel;
    }

    public void setIntIsDel(Integer intIsDel) {
        this.intIsDel = intIsDel;
    }

    public Integer getIntCreateUserID() {
        return intCreateUserID;
    }

    public void setIntCreateUserID(Integer intCreateUserID) {
        this.intCreateUserID = intCreateUserID;
    }

    public Integer getIntUpdateUserID() {
        return intUpdateUserID;
    }

    public void setIntUpdateUserID(Integer intUpdateUserID) {
        this.intUpdateUserID = intUpdateUserID;
    }

    public Timestamp getTimCreateTime() {
        return timCreateTime;
    }

    public void setTimCreateTime(Timestamp timCreateTime) {
        this.timCreateTime = timCreateTime;
    }

    public String getStrSysUser() {
        return strSysUser;
    }

    public void setStrSysUser(String strSysUser) {
        this.strSysUser = strSysUser;
    }

    public String getStrSysPassword() {
        return strSysPassword;
    }

    public void setStrSysPassword(String strSysPassword) {
        this.strSysPassword = strSysPassword;
    }

    public String getStrSysConnect() {
        return strSysConnect;
    }

    public void setStrSysConnect(String strSysConnect) {
        this.strSysConnect = strSysConnect;
    }

    public String getStrSysDriver() {
        return strSysDriver;
    }

    public void setStrSysDriver(String strSysDriver) {
        this.strSysDriver = strSysDriver;
    }

    public Integer getIntSysType() {
        return intSysType;
    }

    public void setIntSysType(Integer intSysType) {
        this.intSysType = intSysType;
    }

    public Integer getIntSortIndex() {
        return intSortIndex;
    }

    public void setIntSortIndex(Integer intSortIndex) {
        this.intSortIndex = intSortIndex;
    }

    @Override
    public String toString() {
        return "SystemInfo{" +
                "intID=" + intID +
                ", strName='" + strName + '\'' +
                ", strDesc='" + strDesc + '\'' +
                ", intSortIndex=" + intSortIndex +
                ", intSysType=" + intSysType +
                ", strDBName='" + strDBName + '\'' +
                ", strSysIP='" + strSysIP + '\'' +
                ", strSysPort='" + strSysPort + '\'' +
                ", strSysUser='" + strSysUser + '\'' +
                ", strSysPassword='" + strSysPassword + '\'' +
                ", strSysConnect='" + strSysConnect + '\'' +
                ", strSysDatabase='" + strSysDatabase + '\'' +
                ", strSysTableSpace='" + strSysTableSpace + '\'' +
                ", strSysDriver='" + strSysDriver + '\'' +
                ", intServerID=" + intServerID +
                ", intCreateUserID=" + intCreateUserID +
                ", timCreateTime=" + timCreateTime +
                ", intUpdateUserID=" + intUpdateUserID +
                ", timUpdateTime=" + timUpdateTime +
                ", intIsDel=" + intIsDel +
                '}';
    }
}
