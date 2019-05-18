package com.tank.gmall.bean;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

@Data
public class BaseCatalog3 implements Serializable {

    @Id
    @Column
    private String id;
    @Column
    private String name; //三级分类名称
    @Column
    private String catalog2Id; //二级分类编号

}
