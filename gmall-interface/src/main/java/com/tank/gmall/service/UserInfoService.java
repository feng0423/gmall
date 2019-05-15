package com.tank.gmall.service;

import com.tank.gmall.bean.UserAddress;
import com.tank.gmall.bean.UserInfo;

import java.util.List;

public interface UserInfoService {
    // alt+enter
    List<UserInfo> findAll();
    // 根据userId 查询用户地址列表
    List<UserAddress> getUserAddressList(String userId);

}
