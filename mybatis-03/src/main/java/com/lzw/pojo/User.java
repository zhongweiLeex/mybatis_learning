package com.lzw.pojo;

import org.apache.ibatis.type.Alias;

import java.util.LinkedList;

/**
 * @ClassName User
 * @Description TODO
 * @Author Administrator
 * @Date 2022/4/12 20:19
 * @Version 1.0
 **/
@Alias("user")
public class User {
    private Integer id;
    private String name;
    private String password;
    private String address;
    private String phone;
    private Dept dept;


    public void setId(Integer id) {
        this.id = id;
    }


    public Dept getDept() {
        return dept;
    }

    public void setDept(Dept dept) {
        this.dept = dept;
    }
    /** *
     * 有参构造器2 用于测试 mapper文件中的 resultMap中 constructor标签
     * @Author zhongweiLee
     * @Description
     * @Date 14:46 2022/4/15
     * @ParamsType [java.lang.Integer, java.lang.String]
     * @ParamsName [id, name]
     * @return
     **/
    public User(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public User() {
    }
    /* *
     * 有参构造器
     * @Author zhongweiLee
     * @Description
     * @Date 14:42 2022/4/15
     * @ParamsType [java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String]
     * @ParamsName [id, name, password, address, phone]
     * @return
     **/
    public User(Integer id, String name, String password, String address, String phone) {
        this.id = id;
        this.name = name;
        this.password = password;
        this.address = address;
        this.phone = phone;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", address='" + address + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
