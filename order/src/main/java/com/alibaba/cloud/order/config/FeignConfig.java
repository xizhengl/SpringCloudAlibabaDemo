package com.alibaba.cloud.order.config;

import com.alibaba.cloud.order.interceptor.feign.CustomFeignInterceptor;
import feign.Logger;
import feign.Request;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

// 全局的日志
//@Configuration
public class FeignConfig {

    @Bean
    public Logger.Level feignLoggerLevel(){
        return Logger.Level.FULL;
    }

//    /**
//     * @return 超时时间
//     */
//    @Bean
//    public Request.Options options() {
//        return new Request.Options(5000, 5000);
//    }

//    /**
//     * @return 自定义拦截器
//     */
//    @Bean
//    public FeignAuthrRequestIntercetor feignAuthRequestInterceptor(){
//        return new FeignAuthrRequestIntercetor();
//    }
}
