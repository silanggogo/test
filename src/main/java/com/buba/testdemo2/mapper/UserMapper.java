package com.buba.testdemo2.mapper;

import com.buba.testdemo2.pojo.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author 四郎
 * @date 2019/11/12 - 9:13
 */
@Repository
public interface UserMapper {
    void addUser(User user);
    void updatUser(User user);
    void deleteUser(int id);
    User findUserById(int id);
    List<User> findUser();
}
