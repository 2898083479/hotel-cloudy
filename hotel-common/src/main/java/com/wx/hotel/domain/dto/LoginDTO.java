package com.wx.hotel.domain.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel("登录信息")
public class LoginDTO {
    @ApiModelProperty("登录账号")
    private String username;

    @ApiModelProperty("登录密码")
    private String password;
}
