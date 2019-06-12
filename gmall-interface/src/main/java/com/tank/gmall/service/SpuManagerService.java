package com.tank.gmall.service;

import com.tank.gmall.bean.BaseSaleAttr;
import com.tank.gmall.bean.SpuInfo;

import java.util.List;

/**
 * @Description:
 * @Author: Tank
 * @Date: 2019/5/20 23:47
 * @Version: 1.0
 */
public interface SpuManagerService {

    /**
     * 获取spu列表
     */
    List<SpuInfo> getSpuInfoList(SpuInfo spuInfo);

    // 查询基本销售属性表
    List<BaseSaleAttr> getBaseSaleAttrList();

    /**
     * 保存销售属性
     */
    void saveSpuInfo(SpuInfo spuInfo);
}
