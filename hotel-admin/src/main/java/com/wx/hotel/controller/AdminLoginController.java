package com.wx.hotel.controller;

import cn.hutool.core.bean.BeanUtil;
import com.wx.hotel.domain.dto.AdminDTO;
import com.wx.hotel.domain.dto.LoginDTO;
import com.wx.hotel.domain.po.Admin;
import com.wx.hotel.domain.vo.AdminLoginVO;
import com.wx.hotel.domain.vo.AdminVO;
import com.wx.hotel.service.AdminService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


@Api(tags = "员工登录接口文档")
@RestController
@RequestMapping("/index")
public class AdminLoginController {

    @Autowired
    private AdminService adminService;

    @PostMapping("/login")
    @ApiOperation("员工登录")
    public AdminLoginVO login(LoginDTO loginDTO){
        return adminService.login(loginDTO);
    }

    @PostMapping("/registry")
    @ApiOperation("员工注册")
    public void registry(LoginDTO loginDTO){
        adminService.registry(loginDTO);
    }

    @GetMapping("/preEdit")
    @ApiOperation("获取旧员工信息")
    public AdminVO preEdit(Long adminId){
        Admin admin = adminService.getById(adminId);
        return BeanUtil.copyProperties(admin,AdminVO.class);
    }

    @PutMapping("/edit")
    @ApiOperation("编辑员工信息")
    public void edit(AdminDTO adminDTO){
        adminService.updateAdminInfo(adminDTO);
    }
}
