package com.lzw.dao;

import com.lzw.pojo.UserBean;
import com.lzw.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * 测试collection
 * @ClassName demo1
 * @Description TODO
 * @Author Administrator
 * @Date 2022/4/15 18:21
 * @Version 1.0
 **/
public class demo1 {
    @Test
    public void testCollection(){
        try(SqlSession sqlSession = MybatisUtils.getSqlSession(true)){
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            List<UserBean> userBeans = userMapper.findAll();
            userBeans.forEach(System.out::println);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
