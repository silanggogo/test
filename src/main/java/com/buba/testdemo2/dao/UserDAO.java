package com.buba.testdemo2.dao;

import com.buba.testdemo2.pojo.User;

import java.util.List;

/**
 * @author 四郎
 * @date 2019/11/13 - 9:32
 */
public interface UserDAO {
    void addUser(User user);
    void deleteUser(int id);
    void updataUser(User user);
    List<User> findUser();
    User findUserById(int id);

}
