package com.wx.hotel.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wx.hotel.domain.dto.RoomDTO;
import com.wx.hotel.domain.po.Room;

public interface RoomService extends IService<Room> {
    void addRoomInfo(RoomDTO roomDTO);
}
