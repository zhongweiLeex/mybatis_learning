package com.lzw.dao;

import com.lzw.pojo.UserBean;
import org.apache.ibatis.annotations.Param;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
    List<UserBean> findAll2();
    UserBean findOne(Integer id);
    Integer getUserCount();

    /*方式1: 使用注解传入参数*/
    HashMap<Object, Object> getUserById(@Param("id") Integer id, @Param("name") String name);


    /*方式2： 使用map传入参数*/
    UserBean getUserById2(HashMap<String,Object> map);

    int save(UserBean userBean);


}
