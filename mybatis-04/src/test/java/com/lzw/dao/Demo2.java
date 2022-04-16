package com.lzw.dao;

import com.lzw.pojo.ParamBean;
import com.lzw.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName Demo2
 * @Description TODO
 * @Author Administrator
 * @Date 2022/4/16 16:02
 * @Version 1.0
 **/
public class Demo2 {
    @Test
    /* *
     * 调用全 in 参数的 存储过程测试
     * @Author zhongweiLee
     * @Description
     * @Date 16:14 2022/4/16
     * @ParamsType []
     * @ParamsName []
     * @return void
     **/
    public void test(){
        try(SqlSession sqlSession = MybatisUtils.getSqlSession(true)){
            UserMapper2 userMapper = sqlSession.getMapper(UserMapper2.class);

            userMapper.updateUserName(1,"lzw1");
        }catch (Exception e){
            e.printStackTrace();
        }
    }
    @Test
    /*调用有out参数的存储过程测试*/
    public void test2(){
        try(SqlSession sqlSession = MybatisUtils.getSqlSession(true)){
            UserMapper2 userMapper = sqlSession.getMapper(UserMapper2.class);

            ParamBean paramBean = new ParamBean();
            paramBean.setUserId(1);
            paramBean.setUserName("");
            userMapper.getUserName(paramBean);

            Map<String,Object> paramMap  = new HashMap<>();

            paramMap.put("userId",2);
            userMapper.getUserName2(paramMap);

            System.out.println("userName = " + paramBean.getName());
            System.out.println("userName = " + paramMap.get("userName"));



            userMapper.getUserAge(paramMap);
            System.out.println(paramMap.get("userId"));

            /*System.out.println(userMapper.getUserAge2(2));*/

            System.out.println(userMapper.updateUserName2(1, "abc"));

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
