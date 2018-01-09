package org.ice.wings.server.filter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


@WebFilter(filterName = "baseFilter", urlPatterns = "/*")
public class BaseFilter extends OncePerRequestFilter {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        System.out.println("正在过滤");
        String employee_id = request.getParameter("employee_id");
        if (employee_id != "1") {
            System.out.println(employee_id);
            System.out.println("账号不合法");
            filterChain.doFilter(request, response);
        }
        System.out.println("过滤结束");
    }

    @Override
    public void destroy() {
        System.out.println("销毁过滤器！");
    }
}
