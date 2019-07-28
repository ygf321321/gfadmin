package com.gf.shirodemo2.service;

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
}
