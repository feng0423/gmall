package com.tank.gmall.bean;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

@Data
public class BaseAttrInfo implements Serializable {

    // 获取主键自增atuo
    @Id
    @Column
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private String id;
    @Column
    private String attrName; //属性名称
    @Column
    private String catalog3Id; //三级分类id
    @Transient
    private List<BaseAttrValue> attrValueList;

}
