package com.lzw.pojo;

/**
 * @ClassName ORMContact
 * @Description 联系方式的javaBean 与 ORMUser 是 一对一关系
 * @Author Administrator
 * @Date 2022/4/16 18:39
 * @Version 1.0
 **/
public class ORMContact {
    private Integer id;
    private Integer userId;
    private String usage;
    private String number;
    private ORMUser user;

    @Override
    public String toString() {
        return "ORMContact{" +
                "id=" + id +
                ", userId=" + userId +
                ", usage='" + usage + '\'' +
                ", number='" + number + '\'' +
                ", user=" + user +
                '}';
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUsage() {
        return usage;
    }

    public void setUsage(String usage) {
        this.usage = usage;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public ORMUser getUser() {
        return user;
    }

    public void setUser(ORMUser user) {
        this.user = user;
    }
}
