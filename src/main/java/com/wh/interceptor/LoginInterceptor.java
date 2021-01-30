package com.wh.interceptor;

import org.springframework.web.servlet.HandlerInterceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//登录拦截器
public class LoginInterceptor implements HandlerInterceptor {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        if (request.getSession().getAttribute("user") == null){
//            request.setAttribute("msg","没有权限，请先登录！");
            response.sendRedirect("/admin");
            return false;
        }
        //已登陆，放行请求
        return true;
    }

}
