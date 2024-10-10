package com.wx.hotel.domain.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDateTime;

/**
 * Author: wuzhonlou
 * 订单实体类
 */
@Data
@TableName("orders")
@EqualsAndHashCode(callSuper = false)
public class Order {

    @TableId(value = "id",type = IdType.AUTO)
    private Long id;

    private Long clientId;

    private String roomIndex;

    private LocalDateTime createTime;

    private LocalDateTime updateTime;
}
