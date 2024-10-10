package com.wx.hotel.domain.bo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel("房间信息")
public class RoomBO {
    @ApiModelProperty("房间号")
    private String roomIndex;
    @ApiModelProperty("房间描述")
    private String roomDesc;
}
