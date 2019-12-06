package com.buba.testdemo2.servlet;

import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author 四郎
 * @date 2019/11/8 - 11:58
 * 存放所有servlet的配置信息  用@ configuration注解标注
 * @Configuration 是springboot的默认方式来配置信息
 * 优点：使代码与注解解耦
 */

@Configuration
public class ServletUtils {
    @Bean
    public ServletRegistrationBean getServletRegistrationBean(){
        ServletRegistrationBean servletRegistrationBean =new ServletRegistrationBean(new SecondServlet());
        servletRegistrationBean.addInitParameter("name3","value3");
        servletRegistrationBean.setLoadOnStartup(1);
        servletRegistrationBean.addUrlMappings("/third");
        servletRegistrationBean.setName("thirdServlet");
        return servletRegistrationBean;
    }
}
