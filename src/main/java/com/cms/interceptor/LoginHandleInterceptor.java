/**  
 * @Title: LoginHandleInterceptorConfig.java
 * @Package com.cms.component
 * @author 田锐
 * @date 2020年7月7日
 * @version V1.0  
 */
package com.cms.interceptor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import com.cms.msg.ScoreMsg;

/**
 * @ClassName: LoginHandleInterceptorConfig
 * @Description: 登录拦截配置，拦截未登录客户。
 * @author 田锐
 * @date 2020年7月7日
 * @since JDK 1.8
 */
@Component
public class LoginHandleInterceptor implements HandlerInterceptor  {

	/* (非 Javadoc)
	 * 
	 * 
	 * @param request
	 * @param response
	 * @param handler
	 * @return
	 * @throws Exception
	 * @see org.springframework.web.servlet.HandlerInterceptor#preHandle(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse, java.lang.Object)
	 */
	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		//通过request获得session
		HttpSession session = request.getSession();
		//获得登录客户的phone
		Object phone=request.getSession().getAttribute("phone");
		/* String phone = (String) session.getAttribute("phone"); */
		
		//号码不为空，是已登录客户，允许访问
		if(phone!=null) {
			return true;
		}
		
		//号码为空，未登录客户，不允许访问
		response.sendRedirect("/");
		return false;
	}
	
	/* (非 Javadoc)
	 * 
	 * 
	 * @param request
	 * @param response
	 * @param handler
	 * @param modelAndView
	 * @throws Exception
	 * @see org.springframework.web.servlet.HandlerInterceptor#postHandle(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse, java.lang.Object, org.springframework.web.servlet.ModelAndView)
	 */
	@Override
	public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler,
			ModelAndView modelAndView) throws Exception {
		HandlerInterceptor.super.postHandle(request, response, handler, modelAndView);
	}
	
	/* (非 Javadoc)
	 * 
	 * 
	 * @param request
	 * @param response
	 * @param handler
	 * @param ex
	 * @throws Exception
	 * @see org.springframework.web.servlet.HandlerInterceptor#afterCompletion(javax.servlet.http.HttpServletRequest, javax.servlet.http.HttpServletResponse, java.lang.Object, java.lang.Exception)
	 */
	@Override
	public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex)
			throws Exception {
		HandlerInterceptor.super.afterCompletion(request, response, handler, ex);
	}
	
}
