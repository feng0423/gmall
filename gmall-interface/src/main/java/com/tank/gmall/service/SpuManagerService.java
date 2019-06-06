package com.tank.gmall.service;

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
}
