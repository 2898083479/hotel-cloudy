package com.wx.hotel.controller;

import cn.hutool.core.bean.BeanUtil;
import com.wx.hotel.domain.dto.ClientDTO;
import com.wx.hotel.domain.po.Client;
import com.wx.hotel.domain.vo.ClientVO;
import com.wx.hotel.service.ClientService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Author: wuzhonlou
 * 客户接口文档
 */
@Api(tags = "客户接口文档")
@RestController
@RequestMapping("/clients")
public class ClientController {

    @Autowired
    private ClientService clientService;

    @GetMapping
    @ApiOperation("测试接口")
    public String test(){
        return "I am a test case";
    }

    /**
     * 查询所有客户信息
     */
    @GetMapping("/list")
    @ApiOperation("查询所有客户信息")
    public List<ClientVO> getAllClientInfo(){
        return BeanUtil.copyToList(clientService.list(),ClientVO.class);
    }

    /**
     *添加客户信息
     */
    @PostMapping
    @ApiOperation("添加客户信息")
    public void addClientInfo(ClientDTO clientDTO){
        clientService.addClientInfo(clientDTO);
    }

    /**
     * 修改客户信息
     */
    @PutMapping
    @ApiOperation("修改客户信息")
    public void updateClientInfo(ClientDTO clientDTO){
        clientService.updateById(BeanUtil.copyProperties(clientDTO,Client.class));
    }

    /**
     * 删除客户信息
     */
    @DeleteMapping
    @ApiOperation("删除客户信息")
    public void delClientInfo(Long id){
        clientService.removeById(id);
    }

    /**
     * 批量查洵客户信息
     */
    @GetMapping("/list")
    @ApiOperation("批量查询客户信息")
    public List<ClientVO> getClientByIds(@RequestParam("ids") List<Long> ids){
        List<Client> clients = clientService.listByIds(ids);
        return BeanUtil.copyToList(clients,ClientVO.class);
    }

    /**
     * 批量删除客户信息
     */
    @DeleteMapping("/list")
    @ApiOperation("批量删除客户信息")
    public void delClientByIds(@RequestParam("ids") List<Long> ids){
        clientService.removeByIds(ids);
    }
}
