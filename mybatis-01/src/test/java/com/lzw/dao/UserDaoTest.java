package com.lzw.dao;

import com.lzw.pojo.User;
import com.lzw.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;

/**
 * @ClassName UserDaoTest
 * @Description TODO
 * @Author Administrator
 * @Date 2022/4/12 20:42
 * @Version 1.0
 **/
public class UserDaoTest {
    /* *
     * 方式1 ： 使用getMapper
     * @Author zhongweiLee
     * @Description 方式1 使用getMapper
     * @Date 21:42 2022/4/12
     * @ParamsType []
     * @ParamsName []
     * @return void
     **/
    @Test
    public void test(){
        try (SqlSession sqlSession = MybatisUtils.getSqlSession()) {
            UserDao mapper = sqlSession.getMapper(UserDao.class);
            List<User> userList = mapper.getUserList();
            userList.forEach(System.out::println);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Test
    public void test2(){
        try (SqlSession sqlSession = MybatisUtils.getSqlSession()) {
            UserDao mapper = sqlSession.getMapper(UserDao.class);
            List<User> userList = mapper.getUserList();
            userList.forEach(System.out::println);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
