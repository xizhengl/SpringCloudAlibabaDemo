package com.alibaba.cloud.order.controller;

import com.alibaba.cloud.order.feign.StockFeignService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private StockFeignService stockFeignService;

    @GetMapping("/add")
    public String addOrder(){
        System.out.println("下单成功~");
        String forObject = stockFeignService.deducted();
        return "下单成功~" + forObject;
    }
}
