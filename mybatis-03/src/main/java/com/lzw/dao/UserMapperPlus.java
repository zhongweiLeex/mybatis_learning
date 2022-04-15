package com.lzw.dao;

import com.lzw.pojo.Dept;
import com.lzw.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMapperPlus {
    User getUserById(Integer id);

    User getUserAndDept(Integer id);

    User getUserAndDept2(Integer id);

    List<User> getUserAndDept3(@Param("did") Integer id);

    Dept getDeptById(Integer id);//获取部门信息
}
