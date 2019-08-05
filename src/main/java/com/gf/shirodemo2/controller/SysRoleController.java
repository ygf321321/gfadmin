package com.gf.shirodemo2.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.core.toolkit.StringUtils;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.gf.shirodemo2.bean.SysRole;
import com.gf.shirodemo2.service.SysRoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/sysrole")
public class SysRoleController {

    @Autowired
    SysRoleService sysRoleService;

    @GetMapping("/sysRoleMange")
    public String toSysRoleManage(){

        return  "/sysrole/roleList";
    }

    @RequestMapping("/roleAdd")
    public String roleAdd(){
        return "/sysrole/roleAdd";
    }

    @RequestMapping("/getRoles")
    @ResponseBody
    public IPage<SysRole> getRoleList(@RequestParam(name = "pageSize")  String pageSize,
                                      @RequestParam(name = "pageNumber") String pageNumber,
                                      @RequestParam(name = "searchText", required=false ) String searchText,
                                      @RequestParam(name = "sortName",required = false) String sortName,
                                      @RequestParam(name = "sortOrder",required = false) String sortOrder){

        Page<SysRole> page = new Page<SysRole>(Integer.valueOf(pageNumber),Integer.valueOf(pageSize));
        QueryWrapper<SysRole> qryWrapper = new QueryWrapper<>();

        if(StringUtils.isNotEmpty(searchText)){
            qryWrapper.like("name", searchText).or()
                    .like("code",searchText);
        }

        if (StringUtils.isNotEmpty(sortName)) {
            if ("desc".equals(sortOrder)){
                qryWrapper.orderByDesc(StringUtils.camelToUnderline(sortName));
            }else {
                qryWrapper.orderByAsc(StringUtils.camelToUnderline(sortName));
            }
        }
        System.out.println(qryWrapper.getSqlSegment());
        IPage<SysRole> roleList = sysRoleService.page(page,qryWrapper);
        return  roleList;

    }

    @PostMapping("/add")
    public String addRole(SysRole sysRole){
        sysRoleService.save(sysRole);

        return "redirect:/sysrole/sysRoleMange";
    }
}
