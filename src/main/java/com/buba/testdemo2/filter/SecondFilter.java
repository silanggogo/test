package com.buba.testdemo2.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * @author 四郎
 * @date 2019/11/11 - 9:4
 * 2132131fuiyfgyig父老体验服
 */


public class SecondFilter implements Filter {
    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("SecondFilter  进入了");
        filterChain.doFilter(servletRequest,servletResponse);
        System.out.println("SecondFilter  完成了");
    }
}
