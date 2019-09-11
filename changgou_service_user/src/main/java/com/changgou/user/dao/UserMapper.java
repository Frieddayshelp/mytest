package com.changgou.user.dao;
import com.changgou.user.pojo.User;
import feign.Param;
import org.apache.ibatis.annotations.Update;
import tk.mybatis.mapper.common.Mapper;

import java.awt.*;

/****
 * @Author:admin
 * @Description:User的Dao
 * @Date 2019/6/14 0:12
 *****/
public interface UserMapper extends Mapper<User> {

    @Update(value = "update tb_user set points=points+#{point} where username=#{username}")
    int adduserpoints(@Param(value = "point")Integer point,@Param(value = "username") String username);
}
