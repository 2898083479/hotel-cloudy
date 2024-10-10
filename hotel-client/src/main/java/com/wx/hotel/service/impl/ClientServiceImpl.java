package com.wx.hotel.service.impl;

import cn.hutool.core.bean.BeanUtil;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wx.hotel.domain.dto.ClientDTO;
import com.wx.hotel.domain.po.Client;
import com.wx.hotel.mapper.ClientMapper;
import com.wx.hotel.service.ClientService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class ClientServiceImpl extends ServiceImpl<ClientMapper, Client> implements ClientService {

    @Resource
    private ClientMapper clientMapper;
    @Override
    public void addClientInfo(ClientDTO clientDTO) {
        Client client = BeanUtil.copyProperties(clientDTO, Client.class);
        client.setOrderNum(0);
        clientMapper.insert(client);
    }
}
