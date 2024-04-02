package com.ablaze.nacos.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author seecin
 * @title OrderController
 * @date 2024/4/2 14:48
 * @Description
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    /**
     * 下单
     *
     * @return
     */
    @RequestMapping("/add")
    public String addOrder() {
        System.out.println("下单成功");

        return "订单服务";
    }
}
