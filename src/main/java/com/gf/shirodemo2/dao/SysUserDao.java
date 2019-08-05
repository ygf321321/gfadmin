package com.gf.shirodemo2.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.gf.shirodemo2.bean.SysUser;
import com.gf.shirodemo2.bean.UserInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface SysUserDao extends BaseMapper<SysUser>{


}
