package com.lzw.dao;

import com.lzw.pojo.User;

public interface UserMapperPlus {
    User getUserById(Integer id);

    User getUserAndDept(Integer id);
}
