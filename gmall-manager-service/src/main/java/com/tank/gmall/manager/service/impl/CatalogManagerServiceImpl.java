package com.tank.gmall.manager.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.tank.gmall.bean.*;
import com.tank.gmall.manager.mapper.*;
import com.tank.gmall.service.CatalogManagerService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @Description:
 * @Author: Tank
 * @Date: 2019/5/17 23:10
 * @Version: 1.0
 */
@Service
public class CatalogManagerServiceImpl implements CatalogManagerService {

    @Autowired
    private BaseCatalog1Mapper baseCatalog1Mapper;
    @Autowired
    private BaseCatalog2Mapper baseCatalog2Mapper;
    @Autowired
    private BaseCatalog3Mapper baseCatalog3Mapper;
    @Autowired
    private BaseAttrInfoMapper baseAttrInfoMapper;
    @Autowired
    private BaseAttrValueMapper baseAttrValueMapper;

    @Override
    public List<BaseCatalog1> getCatalog1() {
        return baseCatalog1Mapper.selectAll();
    }

    @Override
    public List<BaseCatalog2> getCatalog2(String catalog1Id) {
        BaseCatalog2 catalog2 = new BaseCatalog2();
        catalog2.setCatalog1Id(catalog1Id);
        return baseCatalog2Mapper.select(catalog2);
    }

    @Override
    public List<BaseCatalog3> getCatalog3(String catalog2Id) {
        BaseCatalog3 catalog3 = new BaseCatalog3();
        catalog3.setCatalog2Id(catalog2Id);
        return baseCatalog3Mapper.select(catalog3);
    }

    @Override
    public List<BaseAttrInfo> getAttrList(String catalog3Id) {
        BaseAttrInfo baseAttrInfo = new BaseAttrInfo();
        baseAttrInfo.setCatalog3Id(catalog3Id);
        return baseAttrInfoMapper.select(baseAttrInfo);
    }

    @Override
    public void saveOrUpdateAttrInfo(BaseAttrInfo baseAttrInfo) {
        if (baseAttrInfo.getId() != null && baseAttrInfo.getId().length() > 0) {
            //更新属性
            //updateByPrimaryKey更新字段为null
            //更新不为空的字段
            baseAttrInfoMapper.updateByPrimaryKey(baseAttrInfo);
        } else {
            //保存属性名
            if (baseAttrInfo.getId().length() == 0) {
                //防止主键被赋上一个空字符串
                baseAttrInfo.setId(null);
            }
            //其中insertSelecttive给有属性的字段赋值,会进行判断,如果没有就不赋值
            //而insert全部赋值
            baseAttrInfoMapper.insertSelective(baseAttrInfo);
        }
        //更新属性值表,但先把之前的属性删除 , 在插入
        BaseAttrValue baseAttrValue = new BaseAttrValue();
        baseAttrValue.setAttrId(baseAttrInfo.getId());
        baseAttrValueMapper.delete(baseAttrValue);
        if (baseAttrInfo.getAttrValueList() != null && baseAttrInfo.getAttrValueList().size() > 0) {
            for (BaseAttrValue attrValue : baseAttrInfo.getAttrValueList()) {
                //防止主键被附上一个空字符串
                if (attrValue.getId().length() == 0) {
                    attrValue.setId(null);
                }
                attrValue.setAttrId(baseAttrInfo.getId());
                baseAttrValueMapper.insertSelective(attrValue);
            }
        }
    }

    @Override
    public List<BaseAttrValue> getAttrValueList(String attrId) {
        //其实可以拿attrId到属性值列表做查询

        //获取baseInfo对象
        BaseAttrInfo baseAttrInfo = baseAttrInfoMapper.selectByPrimaryKey(attrId);
        BaseAttrValue attrValue = new BaseAttrValue();
        attrValue.setAttrId(baseAttrInfo.getId());
        List<BaseAttrValue> baseAttrValues = baseAttrValueMapper.select(attrValue);
        return baseAttrValues;
    }
}
