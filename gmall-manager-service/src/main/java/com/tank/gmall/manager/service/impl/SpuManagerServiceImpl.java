package com.tank.gmall.manager.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.tank.gmall.bean.SpuInfo;
import com.tank.gmall.manager.mapper.SpuInfoMapper;
import com.tank.gmall.service.SpuManagerService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @Description:
 * @Author: Tank
 * @Date: 2019/5/20 23:49
 * @Version: 1.0
 */
@Service
public class SpuManagerServiceImpl implements SpuManagerService {

    @Autowired
    private SpuInfoMapper spuInfoMapper;

    @Override
    public List<SpuInfo> getSpuInfoList(SpuInfo spuInfo) {
        List<SpuInfo> spuInfoList = spuInfoMapper.select(spuInfo);
        return spuInfoList;
    }
}
