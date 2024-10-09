package com.wx.hotel.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author:wuzhonlou
 * 员工接口文档
 */
@RestController
@RequestMapping("/admins")
@Api(tags = "员工接口文档")
public class AdminController {

    @GetMapping("/test")
    @ApiOperation("测试接口")
    public String test(){
        return "I am a test case";
    }

}
