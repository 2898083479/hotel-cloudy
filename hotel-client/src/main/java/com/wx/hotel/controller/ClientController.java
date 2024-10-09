package com.wx.hotel.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author: wuzhonlou
 * 客户接口文档
 */
@Api(tags = "客户接口文档")
@RestController
@RequestMapping("/clients")
public class ClientController {

    @GetMapping
    @ApiOperation("测试接口")
    public String test(){
        return "I am a test case";
    }

}
