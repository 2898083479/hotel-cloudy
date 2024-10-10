package com.wx.hotel.domain.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(description = "员工视图类")
public class AdminVO {
    @ApiModelProperty("员工id")
    private Long id;
    @ApiModelProperty("员工姓名")
    private String name;
    @ApiModelProperty("员工账号")
    private String username;
    @ApiModelProperty("员工密码")
    private String password;
    @ApiModelProperty("员工手机号")
    private String phone;
    @ApiModelProperty("token")
    private String token;
}
