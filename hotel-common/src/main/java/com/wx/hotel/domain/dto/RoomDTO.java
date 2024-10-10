package com.wx.hotel.domain.dto;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

@Data
@ApiModel(description = "房间传输类")
public class RoomDTO {
    @ApiModelProperty("房间id")
    private Long id;
    @ApiModelProperty("房间编号")
    private String roomIndex;
    @ApiModelProperty("房间描述")
    private String roomDesc;
    @ApiModelProperty("房间状态")
    private int roomStatus;
}
