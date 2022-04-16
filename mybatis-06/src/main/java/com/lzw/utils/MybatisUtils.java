package com.lzw.utils;


import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * Mybatis 工具类 <br>
 * 1. 根据xml配置文件(全局配置文件)创建一个SqlSessionFactory对象 <br>
 * 2. 通过SqlSessionFactory创建SqlSession实例
 * @ClassName MybatisUtils
 * @Description 工具类
 * @Author Administrator
 * @Date 2022/4/12 20:08
 * @Version 1.0
 *
 **/
public class MybatisUtils {

    private static SqlSessionFactory sqlSessionFactory;
    //step 1 : 通过xml配置文件构建 SqlSessionFactory
    static {
        InputStream inputStream = null;
        try {
            String resource = "mybatis-config.xml";
            inputStream = Resources.getResourceAsStream(resource);
            //通过SqlSessionFactoryBuilder 通过xml配置文件 构建一个SqlSessionFactory实例
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    /* *
     * 2. 获取 sqlSession实例， 能直接执行已经映射的sql语句
     * 已经映射的sql语句：selectOne("",arg1 ）
     * 参数1： sql语句唯一标识
     * 参数2： 执行sql语句的参数
     *
     * @Author zhongweiLee
     * @Description 通过SqlSessionFactory 创建SqlSession对象
     * @Date 20:11 2022/4/12
     * @ParamsType []
     * @ParamsName []
     * @return void
     **/
    public static SqlSession getSqlSession() throws Exception{
        return sqlSessionFactory.openSession();
    }

    /* *
     * 可以认为设置是否可以自动提交
     * @Author zhongweiLee
     * @Description
     * @Date 15:57 2022/4/14
     * @ParamsType [boolean]
     * @ParamsName [autoCommit]
     * @return org.apache.ibatis.session.SqlSession
     **/
    public static SqlSession getSqlSession(boolean autoCommit) throws Exception{
        return sqlSessionFactory.openSession(autoCommit);
    }


}
