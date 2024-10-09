package com.wx.hotel.domain.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * author: wuzhonlou
 * 员工类
 */
@Data
@TableName("admin")
@EqualsAndHashCode(callSuper = false)
public class Admin {
    @TableId(value = "id",type = IdType.AUTO)
    private Long id;

    private String name;

    private String username;

    private String password;

    private String phone;
}
