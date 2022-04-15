package com.lzw.pojo;

/**
 * @ClassName ContactBean
 * @Description TODO
 * @Author Administrator
 * @Date 2022/4/15 18:58
 * @Version 1.0
 **/
public class ContactBean extends SubBean{
    private String usage;
    private String number;

    @Override
    public String toString() {
        return "ContactBean{" +
                "usage='" + usage + '\'' +
                ", number='" + number + '\'' +
                '}';
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
}
