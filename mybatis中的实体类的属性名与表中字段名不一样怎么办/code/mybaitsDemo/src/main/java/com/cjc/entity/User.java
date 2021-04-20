package com.cjc.entity;

import lombok.Data;
import org.apache.ibatis.annotations.Param;

/**
 * Created by IntelliJ IDEA.
 * User: cjc
 * Date: 2021/4/19
 * Time: 10:24
 * To change this template use File | Settings | File Templates.
 **/
@Data
public class User {

    private Integer id;
    private String userAcct;
    private String userPswd;

}
