package com.gf.shirodemo2.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.gf.shirodemo2.bean.SysUser;
import com.gf.shirodemo2.bean.UserInfo;
import com.gf.shirodemo2.service.SysUserService;
import com.gf.shirodemo2.service.UserInfoService;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.apache.shiro.crypto.hash.SimpleHash;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@Controller
@RequestMapping("/userInfo")
public class UserInfoController {
//    @Autowired
//    private UserInfoService userInfoService;

    @Autowired
    private SysUserService sysUserService;



    /**
     * 用户查询.
     * @return
     */
    @RequestMapping("/userList")
    public String userInfo(Model model){


//        try {
//            Page<UserInfo> page = new Page<UserInfo>(1,5);
//            IPage<UserInfo> userlist = userInfoService.page(page);
//            IPage<UserInfo> userlist = userInfoService.findUserList(page);
//            model.addAttribute("userList",userlist);
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
        return "user/userList";
    }


    @ResponseBody
    @RequestMapping("/getusers")
    public   IPage<SysUser> getUserList(@RequestParam(name = "pageSize")  String pageSize,
                                          @RequestParam(name = "pageNumber") String pageNumber,
                                         @RequestParam(name = "searchText", required=false ) String searchText,
                                         @RequestParam(name = "sortName",required = false) String sortName,
                                         @RequestParam(name = "sortOrder",required = false) String sortOrder
                                         ){

        Page<SysUser> page = new Page<SysUser>(Integer.valueOf(pageNumber),Integer.valueOf(pageSize));
//        IPage<UserInfo> userlist = userInfoService.page(page);


        QueryWrapper<SysUser> qryWrapper = new QueryWrapper<>();
//        qryWrapper.eq("username", searchText);
        if(StringUtils.isNotEmpty(searchText)){
            qryWrapper.like("username", searchText).or()
                    .like("nickname",searchText);
        }

        if (StringUtils.isNotEmpty(sortName)) {
          if ("desc".equals(sortOrder)){
              qryWrapper.orderByDesc(StringUtils.camelToUnderline(sortName));
          }else {
              qryWrapper.orderByAsc(StringUtils.camelToUnderline(sortName));
          }
        }

        //也可以直接
//        qryWrapper.setEntity(user);

        //打印sql语句
        System.out.println(qryWrapper.getSqlSegment());

//        IPage<UserInfo> userlist=userInfoService.page(page,qryWrapper);
        IPage<SysUser> userlist=sysUserService.page(page,qryWrapper);

        return  userlist;
    }

    /**
     * 用户添加;
     * @return
     */
    @RequestMapping("/userAdd")
//    @RequiresPermissions("userInfo:add")//权限管理;
    public String userInfoAdd(){
        return "user/userAdd";
    }


    @GetMapping("/edit/{userid}")
    public String userEdit(@PathVariable(name = "userid") String userid,
                           Model model){
        SysUser sysUser =sysUserService.getById(userid);
        model.addAttribute("sysUser",sysUser);
        return "user/userEdit";
    }

    @PostMapping("/add")
    public String addUser(SysUser userInfo){

        String hashAlgorithmName = "MD5";
        String credentials = userInfo.getPassword();
        String salt=userInfo.getCredentialsSalt();
        int hashIterations = 2;
        SimpleHash password = new SimpleHash(hashAlgorithmName, credentials, salt, hashIterations);
        userInfo.setPassword(password.toString());
        sysUserService.save(userInfo);
        return  "redirect:/userInfo/userList";
    }

    @PostMapping("/update")
    public String updateUser(SysUser userInfo){

        sysUserService.updateById(userInfo);
        return  "redirect:/userInfo/userList";
    }

    /**
     * 用户删除;
     * @return
     */
    @PostMapping("/del/{userid}")
    @ResponseBody
//    @RequiresPermissions("userInfo:del")//权限管理;
    public String userDel(@PathVariable(name = "userid") String userid){
        if (sysUserService.removeById(userid)){
            return "success";
        }else {
            return "failure";
        }

    }
}
