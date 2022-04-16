package com.lzw.dao;


import com.lzw.pojo.UserBean;
import com.lzw.utils.MybatisUtils;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.Configuration;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @ClassName Demo1
 * @Description TODO
 * @Author Administrator
 * @Date 2022/4/16 18:47
 * @Version 1.0
 **/
public class Demo1 {
    private SqlSessionFactory getFactory() throws IOException {
        InputStream stream = Resources.getResourceAsStream("mybatis-config.xml");
        return new SqlSessionFactoryBuilder().build(stream);
    }
    public static void main(String[] args) {
        try(SqlSession sqlSession = MybatisUtils.getSqlSession(true)){

            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            List<UserBean> all = userMapper.findAll();
            all.forEach(System.out::println);

        }catch (Exception e){
            e.printStackTrace();
        }
    }
    @Test
    /* *
     * 测试mybatis 二级缓存
     * @Author zhongweiLee
     * @Description
     * @Date 22:17 2022/4/16
     * @ParamsType []
     * @ParamsName []
     * @return void
     **/
    public void testCollection() throws IOException {
        SqlSessionFactory factory = getFactory();

        SqlSession sqlSession=factory.openSession();
        SqlSession sqlSession1 = factory.openSession();

        UserMapper userMapper = sqlSession.getMapper(UserMapper.class);

        UserBean one = userMapper.findOne(1);
        sqlSession.close();//关闭第一个会话，再用第二个会话查询 才会命中缓存
        UserMapper userMapper1 = sqlSession1.getMapper(UserMapper.class);
        UserBean one1 = userMapper1.findOne(1);






    }
}
