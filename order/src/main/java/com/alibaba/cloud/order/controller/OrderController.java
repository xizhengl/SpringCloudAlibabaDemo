package com.alibaba.cloud.order.controller;

import com.alibaba.cloud.order.feign.ProductFeignServe;
import com.alibaba.cloud.order.feign.StockFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private StockFeignService stockFeignService;

    @Autowired
    private ProductFeignServe productFeignServe;

    @Value("${user.name}")
    String userName;

    @GetMapping("/add")
    public String addOrder(){
        String p = productFeignServe.selectProduct(1);
        System.out.println("下单成功~");
        String s = stockFeignService.deducted();
        return "下单成功~" + s + p + "-" + userName;
    }
}
