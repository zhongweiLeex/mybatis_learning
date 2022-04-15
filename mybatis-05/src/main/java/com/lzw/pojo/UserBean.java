package com.lzw.pojo;

import java.util.List;

/**
 * @ClassName UserBean
 * @Description TODO
 * @Author Administrator
 * @Date 2022/4/15 17:51
 * @Version 1.0
 **/
public class UserBean {
    private Integer userId;
    private String name;
    private String sex;
    private Integer age;
    private List<SubBean> subList;
    // 用来存放用户关联的多本书籍
    private List<BookBean> bookList;

    public UserBean(Integer userId, String name) {
        this.userId = userId;
        this.name = name;
    }

    public List<SubBean> getSubList() {
        return subList;
    }

    public void setSubList(List<SubBean> subList) {
        this.subList = subList;
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

    public List<BookBean> getBookList() {
        return bookList;
    }

    public void setBookList(List<BookBean> bookList) {
        this.bookList = bookList;
    }

    @Override
    public String toString() {
        StringBuilder subStrs = new StringBuilder();
        for(SubBean sub : subList) {
            subStrs.append("\n\t").append(sub.toString());
        }
        return "UserBean{" +
                "userId=" + userId +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                "} " + subStrs;
    }
}