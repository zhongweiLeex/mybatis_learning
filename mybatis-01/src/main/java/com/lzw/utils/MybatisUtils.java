package com.lzw.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * Mybatis 工具类
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
}
