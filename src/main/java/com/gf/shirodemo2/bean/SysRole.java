package com.gf.shirodemo2.bean;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class SysRole  implements Serializable {
    private static final long serialVersionUID = 1L;
    @TableId(type = IdType.UUID)
    private String id;
    private String code;
    private String name;
    private String descrpt;
    private String state;

    private String insertUid;
    private Date insertTime;
    private String updateUid;
    private Date updateTime;
    private int version;
    @TableField(exist = false)
    private List<SysUser> sysUsers;
    @TableField(exist = false)
    private List<SysPermission> sysPermissions;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescrpt() {
        return descrpt;
    }

    public void setDescrpt(String descrpt) {
        this.descrpt = descrpt;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getInsertUid() {
        return insertUid;
    }

    public void setInsertUid(String insertUid) {
        this.insertUid = insertUid;
    }

    public Date getInsertTime() {
        return insertTime;
    }

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }

    public String getUpdateUid() {
        return updateUid;
    }

    public void setUpdateUid(String updateUid) {
        this.updateUid = updateUid;
    }

    public Date getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public List<SysUser> getSysUsers() {
        return sysUsers;
    }

    public void setSysUsers(List<SysUser> sysUsers) {
        this.sysUsers = sysUsers;
    }

    public List<SysPermission> getSysPermissions() {
        return sysPermissions;
    }

    public void setSysPermissions(List<SysPermission> sysPermissions) {
        this.sysPermissions = sysPermissions;
    }
}
