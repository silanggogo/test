package com.buba.testdemo2.controller;

import com.buba.testdemo2.mapper.UserMapper;
import com.buba.testdemo2.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.sql.DataSource;
import java.util.List;

/**
 * @author 四郎
 * @date 2019/11/7 - 15:07
 */
@RestController
public class UserController {

    @Autowired
    private UserMapper userMapper;

    @Autowired
    private DataSource dataSource;

    @RequestMapping("/addUser")
    public String addUser(User user){
        userMapper.addUser(user);
        return "添加成功";
    }

    @RequestMapping("/selectUser")
    public List<User> selectUser(){
        System.out.println("dataSource"+dataSource);
        List<User> list = userMapper.findUser();
        return list;
    }
    @RequestMapping("/deleteUser")
    public String deleteUser(int id){
        System.out.println("dataSource"+dataSource);
        userMapper.deleteUser(id);
        return "删除成功";
    }
}
