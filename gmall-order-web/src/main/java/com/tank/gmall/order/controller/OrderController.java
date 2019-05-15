package com.tank.gmall.order.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.tank.gmall.bean.UserAddress;
import com.tank.gmall.service.UserAddressService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @Description:
 * @Author: Tank
 * @Date: 2019/5/15 22:45
 * @Version: 1.0
 */
@Controller
public class OrderController {

    @Reference
    private UserAddressService userAddressService;

    @RequestMapping("trade")
    @ResponseBody
    public List<UserAddress> trade(HttpServletRequest request){
        String userId = request.getParameter("userId");
        return userAddressService.findByUserId(userId);
    }
}
