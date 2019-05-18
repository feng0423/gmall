package com.tank.gmall.bean;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

@Data
public class UserAddress implements Serializable {

    @Column
    @Id
    private String id; //编号
    @Column
    private String userAddress; //用户地址
    @Column
    private String userId; //用户id
    @Column
    private String consignee;//收件人
    @Column
    private String phoneNum;//联系方式
    @Column
    private String isDefault;//是否是默认

}
