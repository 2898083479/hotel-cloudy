package com.wx.hotel.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wx.hotel.domain.po.Order;
import com.wx.hotel.domain.vo.OrderVO;

import java.util.List;


public interface OrderService extends IService<Order> {
    List<OrderVO> getAllOrders();
}
