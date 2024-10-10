package com.wx.hotel.controller;

import cn.hutool.core.bean.BeanUtil;
import com.wx.hotel.domain.dto.AdminDTO;
import com.wx.hotel.domain.po.Admin;
import com.wx.hotel.domain.vo.AdminVO;
import com.wx.hotel.service.AdminService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

/**
 * Author:wuzhonlou
 * 员工接口文档
 */
@RestController
@RequestMapping("/admins")
@Api(tags = "员工接口文档")
public class AdminController {

    @Autowired
    private AdminService adminService;

    @GetMapping("/test")
    @ApiOperation("测试接口")
    public String test(){
        return "I am a test case";
    }

    /**
     * 获取所有员工信息
     * @return
     */
    @GetMapping
    @ApiOperation("获取所有员工信息")
    public List<AdminVO> getAllAdminInfo(){
        List<Admin> admins = adminService.list();
        return BeanUtil.copyToList(admins,AdminVO.class);
    }

    /**
     *添加员工信息
     */
    @PostMapping
    @ApiOperation("添加员工信息")
    public void addAdminInfo(AdminDTO adminDTO){
        adminService.addAdminInfo(adminDTO);
    }

    /**
     * 修改员工信息
     */
    @PutMapping
    @ApiOperation("修改员工信息")
    public void updateAdminInfo(AdminDTO adminDTO){
        adminService.updateAdminInfo(adminDTO);
    }

    /**
     * 删除员工信息
     */
    @DeleteMapping
    @ApiOperation("删除员工信息")
    public void delAdminInfo(Long id){
        adminService.removeById(id);
    }

    /**
     * 批量查洵员工信息
     */
    @GetMapping("/list")
    @ApiOperation("批量查询员工信息")
    public List<AdminVO> getAdminByIds(@RequestParam("ids") List<Long> ids){
        List<Admin> admins = adminService.listByIds(ids);
        return BeanUtil.copyToList(admins,AdminVO.class);
    }

    /**
     * 批量删除员工信息
     */
    @DeleteMapping("/list")
    @ApiOperation("批量删除员工信息")
    public void delAdminByIds(@RequestParam("ids") List<Long> ids){
        adminService.removeByIds(ids);
    }



}
