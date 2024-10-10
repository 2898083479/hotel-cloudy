package com.wx.hotel.domain.dto;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel("客户表单实体")
public class ClientDTO {
    @ApiModelProperty("客户id")
    private Long id;
    @ApiModelProperty("客户姓名")
    private String clientName;
    @ApiModelProperty("客户密码")
    private String clientPass;
    @ApiModelProperty("客户手机号")
    private String phone;
    @ApiModelProperty("客户邮箱")
    private String email;
}
