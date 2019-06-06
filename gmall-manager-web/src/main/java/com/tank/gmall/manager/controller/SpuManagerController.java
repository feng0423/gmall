package com.tank.gmall.manager.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.tank.gmall.bean.SpuInfo;
import com.tank.gmall.service.SpuManagerService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Description:
 * @Author: Tank
 * @Date: 2019/5/20 23:31
 * @Version: 1.0
 */
@Controller
public class SpuManagerController {

    @Reference
    private SpuManagerService spuManagerService;

    @RequestMapping("spuList")
    @ResponseBody
    public List<SpuInfo> getSpuInfoList(String catalog3Id){
        SpuInfo spuInfo = new SpuInfo();
        spuInfo.setCatalog3Id(catalog3Id);
        List<SpuInfo> spuInfoList = spuManagerService.getSpuInfoList(spuInfo);
        return spuInfoList;
    }
}
