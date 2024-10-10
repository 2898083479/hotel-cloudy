package com.wx.hotel.domain.vo;


import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(description = "房间视图类")
public class RoomVO {
    @ApiModelProperty("房间id")
    private Long id;
    @ApiModelProperty("房间编号")
    private String roomIndex;
    @ApiModelProperty("房间描述")
    private String roomDesc;
    @ApiModelProperty("房间状态")
    private int roomStatus;
}
