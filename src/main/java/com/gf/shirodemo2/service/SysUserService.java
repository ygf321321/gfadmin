package com.gf.shirodemo2.service;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.gf.shirodemo2.bean.SysUser;
import com.gf.shirodemo2.dao.SysUserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SysUserService extends ServiceImpl<SysUserDao,SysUser> {


}
