package com.gf.shirodemo2.controller;


import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.gf.shirodemo2.bean.SysPermission;
import com.gf.shirodemo2.dao.SysPermissionDao;
import com.gf.shirodemo2.service.SysPermissionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/syspermission")
public class SysPermissionController {
    @Autowired
    SysPermissionService sysPermissionService;
//
@GetMapping("/sysPermissionMange")
public String toSysPermissionManage(){

    return  "/syspermission/permissionList";
}

    @RequestMapping("/permissionAdd/{pid}")
    public String permissionAdd(@PathVariable(name = "pid") String pid, Model model){
        model.addAttribute("pid",pid);
        return "/syspermission/permissionAdd";
    }

    @RequestMapping("/getPermissions")
    @ResponseBody
    public List<SysPermission> getRoleList(@RequestParam(name = "pageSize",required = false)  String pageSize,
                                            @RequestParam(name = "pageNumber",required = false) String pageNumber,
                                            @RequestParam(name = "searchText", required=false ) String searchText,
                                            @RequestParam(name = "sortName",required = false) String sortName,
                                            @RequestParam(name = "sortOrder",required = false) String sortOrder){

//        Page<SysPermission> page = new Page<SysPermission>(Integer.valueOf(pageNumber),Integer.valueOf(pageSize));
//        QueryWrapper<SysPermission> qryWrapper = new QueryWrapper<>();
//
//        if(StringUtils.isNotEmpty(searchText)){
//            qryWrapper.like("name", searchText).or()
//                    .like("code",searchText);
//        }
//
//        if (StringUtils.isNotEmpty(sortName)) {
//            if ("desc".equals(sortOrder)){
//                qryWrapper.orderByDesc(StringUtils.camelToUnderline(sortName));
//            }else {
//                qryWrapper.orderByAsc(StringUtils.camelToUnderline(sortName));
//            }
//        }
//        System.out.println(qryWrapper.getSqlSegment());
        List<SysPermission> permissionList = sysPermissionService.list();
        return  permissionList;

    }

    @PostMapping("/add")
    public String addRole(SysPermission sysPermission){
        sysPermissionService.save(sysPermission);

        return "redirect:/syspermission/sysPermissionMange";
    }

    @PostMapping("/del/{id}")
    @ResponseBody
    public String userDel(@PathVariable(name = "id") String id){
        if (sysPermissionService.removeById(id)){
            return "success";
        }else {
            return "failure";
        }

    }

}
