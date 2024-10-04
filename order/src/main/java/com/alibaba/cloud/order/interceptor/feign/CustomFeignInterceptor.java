package com.alibaba.cloud.order.interceptor.feign;

import feign.RequestInterceptor;
import feign.RequestTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CustomFeignInterceptor implements RequestInterceptor {

    Logger logger = LoggerFactory.getLogger(this.getClass());

    @Override
    public void apply(RequestTemplate requestTemplate) {
        requestTemplate.header("xxx", "xxx");
        requestTemplate.uri("/9");
        logger.info("feign 请求拦截器");
    }
}
