package com.gf.shirodemo2.service;

import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.gf.shirodemo2.bean.SysRole;
import com.gf.shirodemo2.bean.UserInfo;
import com.gf.shirodemo2.dao.UserInfoDao;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.logging.Logger;

@Service
public class UserInfoService {
    @Autowired
    UserInfoDao userInfoDao;

    public UserInfo findByUsername(String username){
        System.out.println("--------------findByUsername:"+username);
        UserInfo userInfo =userInfoDao.findByUsername(username);
        if (userInfo != null) {
            List<SysRole> roleList=userInfoDao.findRoleListByUid(userInfo.getUid());
            if (roleList != null) {
                for (SysRole sysRole : roleList) {
                    sysRole.setPermissions(userInfoDao.findPermissionListByRid(sysRole.getId()));

                }
            }
            userInfo.setRoleList(roleList);


        }

        return userInfo;
    };


   public IPage<UserInfo> findUserList(Page<UserInfo> page) {
       // 不进行 count sql 优化，解决 MP 无法自动优化 SQL 问题，这时候你需要自己查询 count 部分
       // page.setOptimizeCountSql(false);
       // 当 total 为小于 0 或者设置 setSearchCount(false) 分页插件不会进行 count 查询
       // 要点!! 分页返回的对象与传入的对象是同一个
       return userInfoDao.findUserList(page);
   }
}
