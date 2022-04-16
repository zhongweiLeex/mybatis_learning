package com.lzw.pojo;

/**
 * @ClassName ParamBean
 * @Description 参数bean 向sql标签中传入参数的一种方式
 * @Author Administrator
 * @Date 2022/4/16 16:13
 * @Version 1.0
 **/
public class ParamBean {
    private int userId;
    private String userName;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
