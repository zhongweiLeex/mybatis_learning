package com.lzw.dao;

import com.lzw.pojo.Dept;
import com.lzw.pojo.User;
import com.lzw.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * 测试UserMapperPlus 自定义结果集映射 将 Bean属性 与 数据表列名映射对应
 * @ClassName UserMapperPlusTest
 * @Description TODO
 * @Author Administrator
 * @Date 2022/4/14 20:32
 * @Version 1.0
 **/
public class UserMapperPlusTest {
    @Test
    public void test1(){
        try(SqlSession sqlSession = MybatisUtils.getSqlSession()){
            UserMapperPlus mapperPlus = sqlSession.getMapper(UserMapperPlus.class);
            /*
            User userById = mapperPlus.getUserById(1);
            System.out.println(userById);
            */

            /*
                User userAndDept = mapperPlus.getUserAndDept(1);
                System.out.println(userAndDept);
            */

            /*
                User userAndDept2 = mapperPlus.getUserAndDept2(2);
                System.out.println(userAndDept2);
            */
            List<User> userAndDept3 = mapperPlus.getUserAndDept3(2);
            System.out.println(userAndDept3);

            Dept dept = userAndDept3.get(0).getDept();
            System.out.println(dept);

            Dept dept1 = mapperPlus.getDeptById(2);
            System.out.println(dept1);

        }catch (Exception e){
            e.printStackTrace();
        }

    }
}
