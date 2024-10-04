package com.alibaba.cloud.order.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * name 调用的restful接口的服务名，path表示对应的control的requestMapping的接口地址
 */
@FeignClient(name = "service-stock", path = "/stock")
public interface StockFeignService {

    // 对应声明时候需要调用的rest接口的方法
    @GetMapping("/deducted")
    String deducted();

}