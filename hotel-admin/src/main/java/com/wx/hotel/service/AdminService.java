package com.wx.hotel.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.wx.hotel.domain.dto.AdminDTO;
import com.wx.hotel.domain.dto.LoginDTO;
import com.wx.hotel.domain.po.Admin;
import com.wx.hotel.domain.vo.AdminLoginVO;
import com.wx.hotel.domain.vo.AdminVO;

public interface AdminService extends IService<Admin> {
    void addAdminInfo(AdminDTO adminDTO);

    void updateAdminInfo(AdminDTO adminDTO);

    void registry(LoginDTO loginDTO);

    AdminLoginVO login(LoginDTO loginDTO);
}
