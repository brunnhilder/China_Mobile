/**  
 * @Title: LoginHandleInterceptorConfig.java
 * @Package com.cms.component
 * @author 田锐
 * @date 2020年7月7日
 * @version V1.0  
 */
package com.cms.component;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import com.cms.interceptor.LoginHandleInterceptor;

/**
 * @ClassName: LoginHandleInterceptorConfig
 * @Description: 登录拦截配置类
 * @author 田锐
 * @date 2020年7月7日
 * @since JDK 1.8
 */
@Configuration
public class LoginHandleInterceptorConfig implements WebMvcConfigurer {

	/* (非 Javadoc)
	 * 
	 * 
	 * @param registry
	 * @see org.springframework.web.servlet.config.annotation.WebMvcConfigurer#addInterceptors(org.springframework.web.servlet.config.annotation.InterceptorRegistry)
	 */
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		//配置添加登录拦截器
		registry.addInterceptor(new LoginHandleInterceptor()).addPathPatterns
		("/**").excludePathPatterns("/").excludePathPatterns("/loginIndex").excludePathPatterns("/login")
		.excludePathPatterns("/css/**", "/js/**", "/font/**", "/image/**");
		//添加登录拦截器
		WebMvcConfigurer.super.addInterceptors(registry);
	}
	
}
