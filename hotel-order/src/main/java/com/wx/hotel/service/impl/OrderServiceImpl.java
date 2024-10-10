package com.wx.hotel.service.impl;

import cn.hutool.core.bean.BeanUtil;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wx.hotel.domain.po.Order;
import com.wx.hotel.domain.vo.OrderVO;
import com.wx.hotel.mapper.OrderMapper;
import com.wx.hotel.service.OrderService;
import com.wx.hotel.utils.UserContext;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements OrderService {
    @Override
    public List<OrderVO> getAllOrders() {
        //1、获取UserContext中的用户信息
        Long userId = UserContext.getUser();
        //2、查询订单列表
        List<Order> orders = lambdaQuery().eq(Order::getClientId, userId).list();
        //3、转换为vo
        List<OrderVO> vos = BeanUtil.copyToList(orders, OrderVO.class);
        return vos;
    }

    private void handleOrders(List<OrderVO> vos){
        //1、获取客户id
        Set<Long> clientIds = vos.stream().map(OrderVO::getClientId).collect(Collectors.toSet());
        //2、查询客户

    }
}
