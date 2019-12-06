package com.buba.testdemo2.testJDK;

import com.buba.testdemo2.pojo.User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author 四郎
 * @date 2019/11/18 - 13:47
 */
public class TestLambda {


    List<User> items = Arrays.asList(
            new User(1,"请问","123"),
            new User(2,"阿萨德","123"),
            new User(3,"周星驰","1234")
    );
    public  List<User> youhua(List<User> list,suanShu sx){
        ArrayList<User> items = new ArrayList<>();
        for (User user :list){
            if(sx.test(user)){
                items.add(user);
            }
        }
        return items;
    }

    public void test1(){
        List<User> list = youhua(items,(User e) -> {
            return e.getId() >= 1;
        });
        System.out.println(list);
    }
    };

