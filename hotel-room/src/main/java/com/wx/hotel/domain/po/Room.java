package com.wx.hotel.domain.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Author: wuzhonlou
 * 房间实体类
 */
@TableName("room")
@Data
@EqualsAndHashCode(callSuper = false)
public class Room {
    @TableId(value = "id",type = IdType.AUTO)
    private Long id;

    private String roomIndex;

    private String roomDesc;

    private int roomStatus;
}
