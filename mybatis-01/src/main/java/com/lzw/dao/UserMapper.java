package com.lzw.dao;

import com.lzw.pojo.User;

import java.util.List;

public interface UserMapper {
    List<User> getUserList();
    User getUser(int id);
}
