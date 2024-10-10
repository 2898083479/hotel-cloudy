package com.wx.hotel.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wx.hotel.domain.dto.ClientDTO;
import com.wx.hotel.domain.po.Client;

public interface ClientService extends IService<Client> {
    void addClientInfo(ClientDTO clientDTO);
}
