package com.buba.testdemo2.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 四郎
 * @date 2019/11/8 - 14:03
 *
 * @RestController 注解就等于 @Controller和@ResponseBody
 */

@RestController
public class BookController {
    @Value("${com.buba.name}")
    private String name;
    @Value("${com.buba.age}")
    private String age;
    @RequestMapping("/test")
    public String test(){
        System.out.println(name);
        System.out.println(age);
        return "直播间的一切都变的索然无味";
    }


}
