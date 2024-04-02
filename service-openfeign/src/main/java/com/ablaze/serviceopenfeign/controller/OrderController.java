package com.ablaze.serviceopenfeign.controller;

import com.ablaze.serviceopenfeign.openfeign.StockOpenFeignService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author seecin
 * @title OrderController
 * @date 2024/4/2 15:27
 * @Description 订单服务
 */
@RestController
@RequestMapping("/order")
public class OrderController {

    @Resource
    private StockOpenFeignService stockOpenFeignService;

    /**
     * 新增订单
     *
     * @return
     */
    @RequestMapping("/addOrder")
    public String addOrder() {
        System.out.println("订单新增成功");
        //调用库存扣减
        String result = stockOpenFeignService.subStock();
        return "订单服务-订单新增成功:" + result;
    }
}
