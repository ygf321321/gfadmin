package com.gf.shirodemo2.dao;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.gf.shirodemo2.bean.SysPermission1;
import com.gf.shirodemo2.bean.SysRole1;
import com.gf.shirodemo2.bean.UserInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserInfoDao  extends BaseMapper<UserInfo>{

    public UserInfo findByUsername(String username);

    public List<SysRole1> findRoleListByUid(String uid);

    public List<SysPermission1> findPermissionListByRid(Long rid);

    /**
     * <p>
     * 查询 : 根据state状态查询用户列表，分页显示
     * 注意!!: 如果入参是有多个,需要加注解指定参数名才能在xml中取值
     * </p>
     *
     * @param page 分页对象,xml中可以从里面进行取值,传递参数 Page 即自动分页,必须放在第一位(你可以继承Page实现自己的分页对象)
     * @param state 状态
     * @return 分页对象
     */
    public IPage<UserInfo> findUserList(Page page);

}
