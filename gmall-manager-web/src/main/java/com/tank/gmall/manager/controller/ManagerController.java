package com.tank.gmall.manager.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Description:
 * @Author: Tank
 * @Date: 2019/5/17 0:08
 * @Version: 1.0
 */
@Controller
public class ManagerController {

    @RequestMapping("index")
    public String index() {
        return "index";
    }

    @RequestMapping("attrListPage")
    public String getAttrListPage() {
        return "attrListPage";
    }

    @RequestMapping("spuListPage")
    public String getSpuListPage() {
        return "spuListPage";
    }
}
