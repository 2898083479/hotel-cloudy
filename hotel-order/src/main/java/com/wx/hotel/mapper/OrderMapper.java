package com.wx.hotel.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.wx.hotel.domain.po.Order;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface OrderMapper extends BaseMapper<Order> {
}
