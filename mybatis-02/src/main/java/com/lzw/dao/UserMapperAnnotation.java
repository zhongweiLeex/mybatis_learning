package com.lzw.dao;


import com.lzw.pojo.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

/* *
 * 基于注解注册 Mapper sql映射文件
 * @Author zhongweiLee
 * @Description
 * @Date 20:47 2022/4/13
 * @ParamsType
 * @ParamsName
 * @return
 **/
public interface UserMapperAnnotation {
    @Select("select * from user where id = #{id}")
    public User getUserById(Integer id);
}
