package com.alibaba.product.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductController {

    @Value("${server.port}")
    String port;

    @GetMapping("/{id}")
    public String selectProduct(@PathVariable Integer id) throws InterruptedException {
        System.out.println("查询商品" + id);
        return "查询商品" + id + ":" + port;
    }
}
