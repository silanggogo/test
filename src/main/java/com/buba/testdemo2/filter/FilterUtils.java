package com.buba.testdemo2.filter;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 四郎
 * @date 2019/11/11 - 9:45
 *
 * spring-boot 项目中会优先进入配置类配置（也就是有@Configuration注解）的Filter  再到其他配置的Filter
 * 过滤器和拦截器
 * 过滤器：有servlet 的一部分功能，主要是处理请求的安全验证，在所有servlet执行之前执行。
 *         比如：登录验证；
 * 拦截器：是配合框架一起实现的，在spring框架中是通过aop面向切面编程来实现的，在struts2中是通过责任链来实现的。
 */

@Configuration
public class FilterUtils {

    @Bean
    public FilterRegistrationBean getFiletreRegistrationBean(){
        FilterRegistrationBean filterRegistrationBean = new FilterRegistrationBean(new SecondFilter());
        List<String> list = new ArrayList<>();
        list.add("/*");
        filterRegistrationBean.setUrlPatterns(list);
        return filterRegistrationBean;
    }
}
