package com.buba.testdemo2.filter;


import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * @author 四郎
 * @date 2019/11/11 - 9:33
 *
 * filter 过滤器<filter><filter-mapper>
 */
@WebFilter(urlPatterns = "/*")
public class FirstFilter implements Filter {

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("FirstFileter 进入了");
        filterChain.doFilter(servletRequest,servletResponse);
        System.out.println("FirstFileter 完成了");
    }
}
