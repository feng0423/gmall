package com.tank.gmall.usermanager.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.tank.gmall.bean.UserAddress;
import com.tank.gmall.bean.UserInfo;
import com.tank.gmall.service.UserInfoService;
import com.tank.gmall.usermanager.mapper.UserInfoMapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @Description:
 * @Author: Tank
 * @Date: 2019/5/14 23:28
 * @Version: 1.0
 */
@Service
public class UserInfoServiceImpl implements UserInfoService {

    @Autowired
    private UserInfoMapper userInfoMapper;

    @Override
    public List<UserInfo> findAll() {
        return userInfoMapper.selectAll();
    }

    @Override
    public List<UserAddress> getUserAddressList(String userId) {
        return null;
    }
}
