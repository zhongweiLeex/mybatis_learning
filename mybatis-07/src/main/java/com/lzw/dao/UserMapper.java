package com.lzw.dao;

import com.lzw.pojo.UserBean;

import java.util.List;

public interface UserMapper {
    List<UserBean> findAll();
    UserBean findOne(Integer id);
}
