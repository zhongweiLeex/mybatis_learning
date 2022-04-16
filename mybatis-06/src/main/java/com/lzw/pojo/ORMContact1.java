package com.lzw.pojo;

/**
 * @ClassName ORMContact1
 * @Description TODO
 * @Author Administrator
 * @Date 2022/4/16 19:42
 * @Version 1.0
 **/
public class ORMContact1 {
    private Integer id;
    private Integer userId;
    private String usage;
    private String number;
    private ORMUser1 user;

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

    public ORMUser1 getUser() {
        return user;
    }

    public void setUser(ORMUser1 user) {
        this.user = user;
    }
}
