package com.lzw.dao;

import com.lzw.pojo.ORMContact;
import com.lzw.pojo.ORMUser;
import com.lzw.pojo.ORMUser1;
import com.lzw.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * @ClassName Demo1
 * @Description TODO
 * @Author Administrator
 * @Date 2022/4/16 18:47
 * @Version 1.0
 **/
public class Demo1 {
    @Test
    public void testCollection(){
        try(SqlSession sqlSession = MybatisUtils.getSqlSession(true)){
            UserMapper userMapper = sqlSession.getMapper(UserMapper.class);
            List<ORMContact> ormContacts = userMapper.joinSelect();
            ormContacts.forEach(System.out::println);

            System.out.println("-----------------------------------------");

            List<ORMUser1> ormUser1s = userMapper.joinSelect1();
            ormUser1s.forEach(System.out::println);


        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
