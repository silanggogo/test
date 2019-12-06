package com.buba.testdemo2.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author 四郎
 * @date 2019/11/8 - 11:24
 *
 * @webservlet: 把当前servlet交给spring 来管理
 * name:当前servlet的名字
 * rulPatterns:这个servlet 的请求路径，返回值是数组（可以配置多个）
 * loadOnStartup=1 :表示启动项目就加载当前servlet，默认不配置是在发生第一次请求的时候加载当前servlet
 * initParams:加载servlet的时候默认加载的参数，通过getInitParameter方法获取
 *
 */

@WebServlet(name = "firstServlet",urlPatterns = {"/first","/second","/seconds"},loadOnStartup = 1,initParams = {@WebInitParam(name = "name1",value="value1"),@WebInitParam(name = "name2",value="value2")})
public class FirstServlet extends HttpServlet {

    @Override
    public void init() throws ServletException {
        System.out.println("初始化值1："+this.getInitParameter("name1"));
        System.out.println("初始化值2："+this.getInitParameter("name2"));
        System.out.println("我真他妈的服了");
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setCharacterEncoding("GBK");
        resp.getWriter().write("1111111");

    }
}
