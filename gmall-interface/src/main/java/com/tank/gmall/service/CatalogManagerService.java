package com.tank.gmall.service;

import com.tank.gmall.bean.*;

import java.util.List;

/**
 * @Description:
 * @Author: Tank
 * @Date: 2019/5/17 22:21
 * @Version: 1.0
 */
public interface CatalogManagerService {

    //查询所有的以及分类
    List<BaseCatalog1> getCatalog1();
    //查询所有的二级分类
    List<BaseCatalog2> getCatalog2(String catalog1Id);
    //查询所有的三级分类
    List<BaseCatalog3> getCatalog3(String catalog2Id);
    //根据三级分类id查询平台属性列表
    List<BaseAttrInfo> getAttrList(String catalog3Id);
    //根据页面传来的json保存数据
    void saveOrUpdateAttrInfo(BaseAttrInfo baseAttrInfo);
    //获取属性值列表
    List<BaseAttrValue> getAttrValueList(String attrId);
}
