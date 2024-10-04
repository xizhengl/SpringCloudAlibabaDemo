package com.alibaba.cloud.order.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "service-product", path = "/product")
public interface ProductFeignServe {

    @GetMapping("/{id}")
    String selectProduct(@PathVariable("id") Integer id);
}
