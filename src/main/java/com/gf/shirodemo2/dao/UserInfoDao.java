package com.gf.shirodemo2.dao;

import com.gf.shirodemo2.bean.SysPermission;
import com.gf.shirodemo2.bean.SysRole;
import com.gf.shirodemo2.bean.UserInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserInfoDao  {

    public UserInfo findByUsername(String username);

    public List<SysRole> findRoleListByUid(Long uid);

    public List<SysPermission> findPermissionListByRid(Long rid);

}
