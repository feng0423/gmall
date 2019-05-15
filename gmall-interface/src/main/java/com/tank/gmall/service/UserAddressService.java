package com.tank.gmall.service;

import com.tank.gmall.bean.UserAddress;

import java.util.List;

public interface UserAddressService {

    List<UserAddress> findByUserId(String userId);

}
