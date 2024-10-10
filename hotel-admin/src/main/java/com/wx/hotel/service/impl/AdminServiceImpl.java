package com.wx.hotel.service.impl;

import cn.hutool.core.bean.BeanUtil;
import cn.hutool.core.lang.Assert;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.wx.hotel.domain.dto.AdminDTO;
import com.wx.hotel.domain.dto.LoginDTO;
import com.wx.hotel.domain.po.Admin;
import com.wx.hotel.domain.vo.AdminLoginVO;
import com.wx.hotel.exception.BadRequestException;
import com.wx.hotel.mapper.AdminMapper;
import com.wx.hotel.service.AdminService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AdminServiceImpl extends ServiceImpl<AdminMapper,Admin> implements AdminService {

    private final AdminMapper adminMapper;


    @Override
    public void addAdminInfo(AdminDTO adminDTO) {
        adminMapper.insert(BeanUtil.copyProperties(adminDTO,Admin.class));
    }

    @Override
    public void updateAdminInfo(AdminDTO adminDTO) {
        adminMapper.updateById(BeanUtil.copyProperties(adminDTO,Admin.class));
    }

    @Override
    public void registry(LoginDTO loginDTO) {
        Admin admin = BeanUtil.copyProperties(loginDTO, Admin.class);
        adminMapper.insert(admin);
    }

    @Override
    public AdminLoginVO login(LoginDTO loginDTO) {
        //1、数据校验
        String username = loginDTO.getUsername();
        String password = loginDTO.getPassword();

        //2、根据用户名查询
        Admin admin = lambdaQuery().eq(Admin::getUsername, username).one();
        Assert.notNull(admin,"用户名错误");

        //3、校验密码
        if(!password.equals(admin.getPassword())){
            //密码错误
        }

        //todo 4、生成token
        String token = null;
        //封装VO返回
        AdminLoginVO vo = new AdminLoginVO();
        vo.setId(admin.getId());
        vo.setUsername(admin.getUsername());
        vo.setToken(token);
        return vo;
    }
}
