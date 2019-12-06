package com.buba.testdemo2.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author 四郎
 * @date 2019/11/8 - 11:56
 */
public class SecondServlet extends HttpServlet {
    @Override
    public void init() throws ServletException {
        System.out.println(100/0.0);
    }

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setCharacterEncoding("GBK");
        resp.getWriter().write("我他妈快要烦死了");
    }
}
