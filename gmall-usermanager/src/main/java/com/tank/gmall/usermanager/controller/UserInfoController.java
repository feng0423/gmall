package com.tank.gmall.usermanager.controller;

import com.tank.gmall.bean.UserInfo;
import com.tank.gmall.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Description:
 * @Author: Tank
 * @Date: 2019/5/14 23:29
 * @Version: 1.0
 */
@Controller
public class UserInfoController {

    @Autowired
    private UserInfoService userInfoService;


    @RequestMapping("/findAll")
    @ResponseBody  //返回json字符串,将数据显示在页面上
    public List<UserInfo> getAll(){

        return  userInfoService.findAll();
    }
}
