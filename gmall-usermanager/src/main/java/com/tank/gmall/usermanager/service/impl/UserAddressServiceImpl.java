package com.tank.gmall.usermanager.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.tank.gmall.bean.UserAddress;
import com.tank.gmall.service.UserAddressService;
import com.tank.gmall.usermanager.mapper.UserAddressMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @Description:
 * @Author: Tank
 * @Date: 2019/5/15 22:49
 * @Version: 1.0
 */
@Service
public class UserAddressServiceImpl implements UserAddressService {

    @Autowired
    private UserAddressMapper userAddressMapper;

    @Override
    public List<UserAddress> findByUserId(String userId) {
        UserAddress address = new UserAddress();
        address.setUserId(userId);
        return userAddressMapper.select(address);
    }
}
