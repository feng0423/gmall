package com.tank.gmall.bean;

import lombok.Data;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;

@Data
// 为什么要实现序列化? 因为：UserInfo 会通过dubbo的提供者，发布到注册中心上！
public class UserInfo implements Serializable {

    @Id
    @Column
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;  //主键
    @Column
    private String loginName; //用户名称
    @Column
    private String nickName; //用户昵称
    @Column
    private String passwd; //用户密码
    @Column
    private String name; //用户姓名
    @Column
    private String phoneNum;//手机号
    @Column
    private String email;//邮箱
    @Column
    private String headImg;//头像
    @Column
    private String userLevel;//用户级别

}
