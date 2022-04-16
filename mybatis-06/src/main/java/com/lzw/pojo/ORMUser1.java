package com.lzw.pojo;

import java.sql.Date;
import java.util.Arrays;
import java.util.List;

/**
 * @ClassName ORMUser1
 * @Description TODO
 * @Author Administrator
 * @Date 2022/4/16 19:43
 * @Version 1.0
 **/
public class ORMUser1 {
    private Integer userId;
    private String name;
    private String sex;
    private Integer age;
    private Double salary;
    private Date birthday;
    private byte[] face;
    private List<ORMContact1> contactList;

    public List<ORMContact1> getContactList() {
        return contactList;
    }

    @Override
    public String toString() {
        return "ORMUser1{" +
                "userId=" + userId +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", birthday=" + birthday +
                ", contactList=" + contactList +
                '}';
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public byte[] getFace() {
        return face;
    }

    public void setFace(byte[] face) {
        this.face = face;
    }

    public void setContactList(List<ORMContact1> contactList) {
        this.contactList = contactList;
    }
}
