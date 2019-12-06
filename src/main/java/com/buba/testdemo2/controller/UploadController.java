package com.buba.testdemo2.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;

/**
 * @author 四郎
 * @date 2019/11/11 - 10:43
 */
@Controller
public class UploadController {
    @RequestMapping("/upload")
    public String puload(MultipartFile file, Model model){
        String name = file.getOriginalFilename();
        try{
            file.transferTo(new File(" C://"));
            model.addAttribute("name","value");
        }catch(Exception e){
            e.getStackTrace();
        }
        return "wewin";
    }
}
