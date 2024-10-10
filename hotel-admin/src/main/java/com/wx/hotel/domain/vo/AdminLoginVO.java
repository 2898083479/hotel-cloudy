package com.wx.hotel.domain.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel("员工登录视图类")
public class AdminLoginVO {
    @ApiModelProperty("员工id")
    private Long id;
    @ApiModelProperty("员工账号")
    private String username;
    @ApiModelProperty("token")
    private String token;
}
