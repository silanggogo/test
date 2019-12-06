package com.buba.testdemo2.controller;

import com.buba.testdemo2.mapper.UserMapper;
import com.buba.testdemo2.pojo.User;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.sql.DataSource;
import java.util.List;

/**
 * @author 四郎
 * @date 2019/11/13 - 10:42
 *
 * restful  风格是一种通过请求的url地址和请求的类型来确定请求的方法
 * restful 要求异步请求；
 * 在sprinmvc中的responsebody 就是restful风格的注解
 *
 * 在Springboot项目中的restful风格注解
 * @RestController @Controller  @ResponseBody 的结合体
 * @GetMapping    是一个方法注解，只有查询方法使用，只能被get请求方式请求
 * @PostMapping   是一个方法注解，只有添加方法使用，只能被post请求方式请求
 * @PutMapping    是一个方法注解，只有修改方法使用，只能被put请求方式请求
 * @DeleteMapping 是一个方法注解，只有删除方法使用，只能被delete请求方式请求
 */

@RestController
@RequestMapping("/userRestfulController")
@ApiOperation("这个是测试restful风格")
public class UserRestfulController {
    @Autowired
    private UserMapper userMapper;

    @Autowired
    private DataSource dataSource;

    //@PostMapping就相当于@RequestMapping(value= "/addUser",method = RequestMethod.POST)
    //@PathVariable能通过获取到restful的特殊请求中的参数，参数是url的一部分
    //             通过变量的形式进行传递，后台接收路径是/路径/{变量名}
    @PostMapping("/addUser/{username}/{password}/{id}")
    public String addUser(@PathVariable("username")String username,
                          @PathVariable("password")String password,
                          @PathVariable("id")int id){

        //userMapper.addUser(user);
        System.out.println(username+password+id);
        return "添加成功";
    }

    @RequestMapping("/selectUser")
    public List<User> selectUser(){
        System.out.println("dataSource"+dataSource);
        List<User> list = userMapper.findUser();
        return list;
    }
    //@RequestMapping("/deleteUser")
    @DeleteMapping
    @ApiOperation(value="firstblood",notes="doublekill")
    public String deleteUser(int id){
        System.out.println("dataSource"+dataSource);
        userMapper.deleteUser(id);
        return "删除成功";
    }
}
