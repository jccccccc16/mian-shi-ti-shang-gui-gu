package com.cjc.mapper;

import com.cjc.entity.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by IntelliJ IDEA.
 * User: cjc
 * Date: 2021/4/19
 * Time: 10:18
 * To change this template use File | Settings | File Templates.
 **/
@Mapper
public interface UserMapper {

    List<User> selectAll();

}
