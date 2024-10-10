package com.wx.hotel.controller;

import cn.hutool.core.bean.BeanUtil;
import com.wx.hotel.domain.po.Order;
import com.wx.hotel.domain.vo.OrderVO;
import com.wx.hotel.service.OrderService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Api("订单接口文档")
@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping
    @ApiOperation("测试接口")
    public String test(){
        return "I am a test case";
    }

    @GetMapping("/list")
    @ApiOperation("获取所有订单信息")
    public List<OrderVO> getAllOrders(){
        List<OrderVO> vos = orderService.getAllOrders();
        return vos;
    }

    /**
     * todo 提交订单
     */


    /**
     * todo 删除订单
     */
}
