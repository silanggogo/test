package com.buba.testdemo2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Date;

/**
 * @author 四郎
 * @date 2019/11/15 - 9:01
 */
@Controller
public class ThymeleafController {
    @RequestMapping("/indexin")
    public String index(Model model){
        model.addAttribute("name","兴奥哥哥");
        model.addAttribute("time",new Date());
        return "index";
    }
}
