package org.caps.microservice.web.news.config;

import org.caps.microservice.web.news.interceptor.WebNewsInterceptor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@Configuration
public class WebNewsInterceptorConfig implements WebMvcConfigurer {

    @Bean
    public WebNewsInterceptor webPostsInterceptor() {
        return new WebNewsInterceptor();
    }

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(webPostsInterceptor())
                .addPathPatterns("/**")
                .excludePathPatterns("/static/**");
    }
}
