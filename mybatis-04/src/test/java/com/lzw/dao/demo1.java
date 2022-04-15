package com.lzw.dao;

import com.lzw.pojo.UserBean;
import com.lzw.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
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

            List<UserBean> findAll = userMapper.findAll2();
            findAll.forEach(System.out::println);

            System.out.println();

            UserBean findOne = userMapper.findOne(2);
            System.out.println(findOne);

            System.out.println();


            System.out.println();
            HashMap<Object, Object> userById = userMapper.getUserById(1,"lizhongwei");
            System.out.println(userById);


            Integer userCount = userMapper.getUserCount();
            System.out.println(userCount);

            HashMap<String, Object> map = new HashMap<>();
            map.put("id",1);
            map.put("name","lizhongwei");
            System.out.println(userMapper.getUserById2(map));

            int save = userMapper.save(new UserBean(4, "lxy", "female", 10));
            System.out.println(save);
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
