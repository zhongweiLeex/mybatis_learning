package com.lzw.pojo;

import java.io.Serializable;
import java.sql.Date;
import java.util.Arrays;

/**
 * @ClassName ORMUser
 * @Description user 与 contact 是一对一关系
 * @Author Administrator
 * @Date 2022/4/16 18:43
 * @Version 1.0
 **/
public class UserBean implements Serializable {
    private Integer userId;
    private String name;
    private String sex;
    private Integer age;
    private Double salary;
    private Date birthday;
    private byte[] face;

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", birthday=" + birthday +
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
}
