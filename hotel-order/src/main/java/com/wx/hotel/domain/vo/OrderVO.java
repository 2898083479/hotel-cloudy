package com.wx.hotel.domain.vo;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@ApiModel("订单视图类")
public class OrderVO {
    @ApiModelProperty("订单id")
    private Long id;
    @ApiModelProperty("客户id")
    private Long clientId;
    @ApiModelProperty("客户姓名")
    private String clientName;
    @ApiModelProperty("客户手机号")
    private String phone;
    @ApiModelProperty("客户邮箱")
    private String email;
    @ApiModelProperty("房间号")
    private String roomIndex;
    @ApiModelProperty("房间描述")
    private String roomDesc;
    @ApiModelProperty("创建时间")
    private LocalDateTime createTime;
    @ApiModelProperty("修改时间")
    private LocalDateTime updateTime;
}
