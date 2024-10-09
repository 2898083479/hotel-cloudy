package com.wx.hotel.controller;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Author: wuzhonlou
 * 房间接口文档
 */
@Api("房间接口文档")
@RestController
@RequestMapping("/rooms")
public class RoomController {

    @GetMapping
    @ApiOperation("接口测试")
    public String test(){
        return "I am a test case";
    }
}
