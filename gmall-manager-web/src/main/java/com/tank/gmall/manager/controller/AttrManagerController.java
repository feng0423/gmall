package com.tank.gmall.manager.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.tank.gmall.bean.*;
import com.tank.gmall.service.CatalogManagerService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Description:
 * @Author: Tank
 * @Date: 2019/5/17 0:45
 * @Version: 1.0
 */
//平台属性的数据展示
@Controller
public class AttrManagerController {

    @Reference
    private CatalogManagerService catalogManagerService;

    //因为easyUi控件是基于json格式数据
    @RequestMapping("getCatalog1")
    @ResponseBody
    public List<BaseCatalog1> getCatalog1(){
        //调用服务层查询所有数据
        return catalogManagerService.getCatalog1();
    }
    @RequestMapping("getCatalog2")
    @ResponseBody
    public List<BaseCatalog2> getCatalog2(String catalog1Id){
        //调用服务层查询所有数据
        return catalogManagerService.getCatalog2(catalog1Id);
    }
    @RequestMapping("getCatalog3")
    @ResponseBody
    public List<BaseCatalog3> getCatalog3(String catalog2Id){
        //调用服务层查询所有数据
        return catalogManagerService.getCatalog3(catalog2Id);
    }

    @RequestMapping("attrInfoList")
    @ResponseBody
    public List<BaseAttrInfo> attrInfoList(String catalog3Id) {
        //调用服务层查询所有数据
        return catalogManagerService.getAttrList(catalog3Id);
    }

    @RequestMapping(value ="saveOrUpdateAttrInfo",method = RequestMethod.POST)
    @ResponseBody
    public String saveOrUpdateAttrInfo(BaseAttrInfo baseAttrInfo){
        catalogManagerService.saveOrUpdateAttrInfo(baseAttrInfo);
        return "success";
    }

    @RequestMapping(value ="getAttrValueList")
    @ResponseBody
    public List<BaseAttrValue> getAttrValueList(String attrId){
        List<BaseAttrValue> baseAttrValues = catalogManagerService.getAttrValueList(attrId);
        return baseAttrValues;
    }
}
