package com.wx.hotel.service.impl;

import cn.hutool.core.bean.BeanUtil;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wx.hotel.domain.dto.RoomDTO;
import com.wx.hotel.domain.po.Room;
import com.wx.hotel.mapper.RoomMapper;
import com.wx.hotel.service.RoomService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class RoomServiceImpl extends ServiceImpl<RoomMapper, Room> implements RoomService {

    @Resource
    private RoomMapper roomMapper;

    @Override
    public void addRoomInfo(RoomDTO roomDTO) {
        roomMapper.insert(BeanUtil.copyProperties(roomDTO,Room.class));
    }
}
