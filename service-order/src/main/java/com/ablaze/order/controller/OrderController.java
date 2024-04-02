package com.ablaze.order.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author seecin
 * @title OrderController
 * @date 2024/4/2 14:59
 * @Description
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @Resource
    private RestTemplate restTemplate;

    @PostMapping("/addOrder")
    public String addOrder() {
        System.out.println("订单新增成功");
        //调用库存扣减
        String apiReqResult = restTemplate.getForObject("http://service-stock/stock/subStock", String.class);
        return "订单服务-订单新增成功:" + apiReqResult;
    }
}
