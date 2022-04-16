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
public class Demo1 {
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
            System.out.println("--------------结果类型测试1：map结果类型-------------");
            HashMap<Object, Object> userById = userMapper.getUserById(1,"lizhongwei");
            System.out.println(userById);
            System.out.println("--------------结果类型测试2： Integer结果类型------------");
            Integer userCount = userMapper.getUserCount();
            System.out.println(userCount);
            System.out.println("--------------map传参测试----------------");
            HashMap<String, Object> map = new HashMap<>();
            map.put("id",1);
            map.put("name","lizhongwei");
            System.out.println(userMapper.getUserById2(map));
            System.out.println("---------------插入测试-----------------");

//              int save = userMapper.save(new UserBean(4, "lxy", "female", 10));
            /*
                UserBean userBean = new UserBean();
                userBean.setName("lzw"+System.currentTimeMillis());
                userBean.setAge(16);
                userBean.setSex("male");
                int save = userMapper.save(userBean);
                System.out.println("save = " + save);
                System.out.println("user id is " + userBean.getUserId());
            */
            System.out.println("---------------更新测试-----------------");
            UserBean userBean1 = new UserBean();
            userBean1.setSex("female");
            userBean1.setAge(10);
            userBean1.setName("lzw123");
            userBean1.setUserId(1);
            int update = userMapper.updateUser(userBean1);
            System.out.println("总共更新了："+update + "条数据");
            System.out.println("---------------删除测试-----------------");
            int result = userMapper.deleteUser(6);
            System.out.println("总共删除了：" + result+"条数据");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
