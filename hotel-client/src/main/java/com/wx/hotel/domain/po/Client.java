package com.wx.hotel.domain.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * Author: wuzhonlou
 * 客户实体类
 */
@Data
@TableName
@EqualsAndHashCode(callSuper = false)
public class Client {
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private String clientName;

    private String clientPass;

    private String phone;

    private String email;

    private int orderNum;
}
