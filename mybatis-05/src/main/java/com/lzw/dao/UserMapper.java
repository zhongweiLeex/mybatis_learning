package com.lzw.dao;

import com.lzw.pojo.UserBean;

import java.util.List;

public interface UserMapper {
    /* *
     * 查询所有用户信息
     * @Author zhongweiLee
     * @Description
     * @Date 18:16 2022/4/15
     * @ParamsType []
     * @ParamsName []
     * @return java.util.List<com.lzw.pojo.UserBean>
     **/
    List<UserBean> findAll();
}
