package com.lzw.dao;

import com.lzw.pojo.User;
import com.lzw.utils.MybatisUtils;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * @ClassName UserDaoTest
 * @Description
 * 1. 接口式编程，
 *              原生 ： DAO ===> DaoImpl
 *              Mybatis: Mapper ===> xxMapper.xml
 * 2. SqlSession 代表和数据库的一次会话， 使用结束必须关闭
 * 3. SqlSession 与 Connection 一样 不是线程安全的， 导致线程冲突 每次使用都应该创建新的对象
 * 4. xxxmapper接口没有实现类，但是mybatis会为这个接口生成一个代理对象
 *              (将接口与xml文件绑定)
 *              xxxMapper mapper = sqlSession.getMapper(xxxmapper.class)
 * 5. 两个重要配置文件
 *              mybatis全局配置文件：包含数据库连接池信息，事务管理器信息等，系统运行环境
 *            + sql映射文件：保存了sql语句映射信息（返回结果信息，sql语句， 占位符参数） ，
 *                          将接口方法与 sql语句绑定起来，将sql抽取出来
 * @Author Administrator
 * @Date 2022/4/12 20:42
 * @Version 1.0
 **/
public class UserMapperTest {

    @Test

/* *
 * 获取一个User记录 <br>
 * 1： 根据xml配置文件 （全局配置文件） 创建一个SqlSessionFactory对象 <br>
 * 2： sql映射文件； 配置了每一个sql， 以及sql的凤凰规则 <br>
 * 3. 将sql映射文件注册到全局配置文件中
 *
 * @Author zhongweiLee
 * @Description 方式1 使用getMapper
 * @Date 21:42 2022/4/12
 * @ParamsType []
 * @ParamsName []
 * @return void
 **/
    public void test(){
        //获取会话资源
        try (SqlSession sqlSession = MybatisUtils.getSqlSession()) {

            UserMapper mapper = sqlSession.getMapper(UserMapper.class);//面向接口编程

            User user = mapper.getUser(1);
            System.out.println(user);

            System.out.println("---------------------------");

            User user1 = mapper.getUserByIdAndName(8,"test");
            System.out.println(user1);

            System.out.println("---------------------------");

            Map<String, Object> map = new HashMap<>();
//            map.put("tableName","user");
            map.put("id",8);
            map.put("name","test");
            User userByMap = mapper.getUserByMap(map);
            System.out.println(userByMap);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @Test
/* *
 * 获取一组User数据记录
 * @Author zhongweiLee
 * @Description
 * @Date 14:40 2022/4/13
 * @ParamsType []
 * @ParamsName []
 * @return void
 **/
    public void test2(){
        /* ***
         *
         * 1. 获取sqlSessionFactory对象
         * 2. 获取sqlSession
         * 3. sqlSession.getMapper(接口.class) 获取接口实现类对象
         *    会为接口自动创建一个代理对象，代理对象执行增删改查操作
         * 4. 调用接口方法 mapper.getUser()方法
         */
        try (SqlSession sqlSession = MybatisUtils.getSqlSession()) {
            UserMapper mapper = sqlSession.getMapper(UserMapper.class);
            System.out.println(mapper.getClass());
            List<User> userList = mapper.getUserList();
            userList.forEach(System.out::println);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Test
    /* *
     * 测试插入和删除方法
     * @Author zhongweiLee
     * @Description
     * @Date 15:54 2022/4/14
     * @ParamsType []
     * @ParamsName []
     * @return void
     **/
    public void test3(){
        //1. 获取SqlSession 设置不自动提交数据
        try(SqlSession sqlSession = MybatisUtils.getSqlSession(false)) {
            UserMapper mapper = sqlSession.getMapper(UserMapper.class);
//            mapper.addUser(new User(null,"test","12acc","中国","12345524"));
//            mapper.update(new User(6,"章子怡","qwerty","Beijing","13788658672"));
//            System.out.println(mapper.delete(7));
            User user = new User(null, "test", "12acc", "中国", "12345524");

            mapper.addUser(user);
            System.out.println(user.getId());
            //2. 手动提交
            sqlSession.commit();
        }catch (Exception e){
            e.printStackTrace();
        }
    }


    @Test
    public void test4(){
        //1. 获取SqlSession 设置不自动提交数据
        try(SqlSession sqlSession = MybatisUtils.getSqlSession(false)) {
            UserMapper mapper = sqlSession.getMapper(UserMapper.class);

            Map<String, Object> userByIdReturnMap = mapper.getUserByIdReturnMap(1);
            System.out.println(userByIdReturnMap);
            System.out.println(userByIdReturnMap.getClass());


            Map<Integer, User> userByIdReturnUser = mapper.getUserByIdReturnUser("%t%");
            System.out.println(userByIdReturnUser);
            //2. 手动提交
            sqlSession.commit();
        }catch (Exception e){
            e.printStackTrace();
        }
    }


}
