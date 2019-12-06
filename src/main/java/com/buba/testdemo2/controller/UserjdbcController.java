package com.buba.testdemo2.controller;

import com.buba.testdemo2.dao.UserDAO;
import com.buba.testdemo2.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.List;

/**
 * @author 四郎
 * @date 2019/11/7 - 15:07
 */
@RestController
public class UserjdbcController {

    @Autowired
    private UserDAO userDAO;


    @RequestMapping("/addjdbcUser")
    public String addUser(User user){
        userDAO.addUser(user);
        return "添加成功";
    }

    @RequestMapping("/selectjdbcUser")
    public List<User> selectUser(){
        List<User> list = userDAO.findUser();
        return list;
    }
    @RequestMapping("/deletejdbcUser")
    public String deleteUser(int id){
        userDAO.deleteUser(id);
        return "删除成功";
    }
}
