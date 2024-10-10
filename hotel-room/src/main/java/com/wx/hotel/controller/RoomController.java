package com.wx.hotel.controller;

import cn.hutool.core.bean.BeanUtil;
import com.wx.hotel.domain.dto.RoomDTO;
import com.wx.hotel.domain.po.Room;
import com.wx.hotel.domain.vo.RoomVO;
import com.wx.hotel.service.RoomService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

/**
 * Author: wuzhonlou
 * 房间接口文档
 */
@Api("房间接口文档")
@RestController
@RequestMapping("/rooms")
public class RoomController {

    @Autowired
    private RoomService roomService;

    @GetMapping
    @ApiOperation("接口测试")
    public String test(){
        return "I am a test case";
    }

    /**
     * 查询所有房间信息
     */
    @GetMapping("/list")
    @ApiOperation("查询所有房间信息")
    public List<RoomVO> getAllClientInfo(){
        return BeanUtil.copyToList(roomService.list(),RoomVO.class);
    }

    /**
     *添加房间信息
     */
    @PostMapping
    @ApiOperation("添加房间信息")
    public void addRoomInfo(RoomDTO roomDTO){
        roomService.addRoomInfo(roomDTO);
    }

    /**
     * 修改房间信息
     */
    @PutMapping
    @ApiOperation("修改房间信息")
    public void updateRoomInfo(RoomDTO roomDTO){
        roomService.updateById(BeanUtil.copyProperties(roomDTO, Room.class));
    }

    /**
     * 删除房间信息
     */
    @DeleteMapping
    @ApiOperation("删除房间信息")
    public void delRoomInfo(Long id){
        roomService.removeById(id);
    }

    /**
     * 批量查洵房间信息
     */
    @GetMapping("/list")
    @ApiOperation("批量查询房间信息")
    public List<RoomVO> getRoomByIds(@RequestParam("ids") List<Long> ids){
        List<Room> rooms = roomService.listByIds(ids);
        return BeanUtil.copyToList(rooms,RoomVO.class);
    }

    /**
     * 批量删除房间信息
     */
    @DeleteMapping("/list")
    @ApiOperation("批量删除房间信息")
    public void delRoomByIds(@RequestParam("ids") List<Long> ids){
        roomService.removeByIds(ids);
    }
}
