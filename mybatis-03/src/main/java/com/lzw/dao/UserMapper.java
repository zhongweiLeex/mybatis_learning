package com.lzw.dao;

import com.lzw.pojo.User;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

public interface UserMapper {
    List<User> getUserList();
    //返回一条记录的map key就是列名，value就是对应的值
    Map<String, Object> getUserByIdReturnMap(Integer id);

    //多条记录封装一个map Map<Integer,User对象>
    //封装map的时候使用哪个属性作为map的键
    @MapKey("id")
    Map<Integer,User> getUserByIdReturnUser(String name);


    User getUser(int id);

    void addUser(User user);

    void update(User user);

    boolean delete(Integer id);

//    User getUserByIdAndName(Integer id,String name);
    User getUserByIdAndName(@Param("id") Integer id, @Param("name") String name);
    User getUserByMap(Map<String,Object> map);

}
