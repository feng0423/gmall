package com.tank.gmall.bean;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

@Data
public class BaseCatalog1 implements Serializable {

    @Id
    @Column
    private String id; //编号
    @Column
    private String name; //一级分类名称

}
