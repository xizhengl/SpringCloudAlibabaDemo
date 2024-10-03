package com.alibaba.cloud.order.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
@RequestMapping("/order")
public class OrderController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/add")
    public String addOrder(){
        System.out.println("下单成功~");
        String forObject = restTemplate.getForObject("http://service-stock/stock/deducted", String.class);
        return "下单成功~" + forObject;
    }
}
