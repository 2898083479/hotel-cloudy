package com.wx.hotel.domain.bo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel("客户信息")
public class ClientBO {
    @ApiModelProperty("客户姓名")
    private String clientName;
    @ApiModelProperty("客户手机号")
    private String phone;
    @ApiModelProperty("客户邮箱")
    private String email;
}
