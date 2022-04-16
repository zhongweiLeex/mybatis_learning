package com.lzw.dao;

import com.lzw.pojo.ParamBean;
import org.apache.ibatis.annotations.Param;

import java.util.HashMap;
import java.util.Map;

public interface UserMapper2 {
    /* *
     * 调用存储过程，将用户id为 userId 的用户 用户名更新为 userName
     * @Author zhongweiLee
     * @Description
     * @Date 15:23 2022/4/16
     * @ParamsType [int, java.lang.String]
     * @ParamsName [userId, userName]
     * @return void
     **/
    void updateUserName(@Param("userId") int userId, @Param("userName") String userName);

    /* *
     * 使用paramBean方式传入参数 与前面的 map方式传入参数类似
     * @Author zhongweiLee
     * @Description
     * @Date 16:16 2022/4/16
     * @ParamsType [com.lzw.pojo.ParamBean]
     * @ParamsName [paramBean]
     * @return java.lang.String
     **/
    void getUserName(ParamBean paramBean);

    void getUserName2(Map<String,Object> map);

    /*通过userId 获取对应 age*/
    void getUserAge(Map<String,Object> map);

    /*int getUserAge2(Integer id); 不可以使用普通类型来接 OUT / INOUT参数 */

    int updateUserName2(@Param("userId") int userId, @Param("userName") String userName);
}
