package com.lzw.dao;

import com.lzw.pojo.ORMContact;
import com.lzw.pojo.ORMUser;
import com.lzw.pojo.ORMUser1;

import java.util.List;

public interface UserMapper {
    /* *
     * 一对一关系 association
     * @Author zhongweiLee
     * @Description
     * @Date 18:16 2022/4/15
     * @ParamsType []
     * @ParamsName []
     * @return java.util.List<com.lzw.pojo.UserBean>
     **/
    List<ORMContact> joinSelect();
    /* *
     * 一对多关系 collection标签
     * @Author zhongweiLee
     * @Description
     * @Date 19:46 2022/4/16
     * @ParamsType []
     * @ParamsName []
     * @return java.util.List<com.lzw.pojo.ORMUser1>
     **/
    List<ORMUser1> joinSelect1();
}
