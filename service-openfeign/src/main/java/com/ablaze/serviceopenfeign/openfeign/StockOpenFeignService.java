package com.ablaze.serviceopenfeign.openfeign;

import com.ablaze.serviceopenfeign.config.OpenFeignConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * name:指定调用rest接口所对应的服务名
 * path:指定调用rest接口所在的StockController指定的@RequestMapping
 *
 * @author seecin
 * @title com.ablaze.serviceopenfeign.openfeign.StockOpenFeignService
 * @date 2024/4/2 15:25
 * @Description
 */
@FeignClient(name = "service-stock", path = "stock")
// @FeignClient(name = "service-stock",path = "stock",configuration = OpenFeignConfig.class)
public interface StockOpenFeignService {

    //声明需要调用的rest接口对应的方法

    /**
     * 库存扣减
     *
     * @return
     */
    @RequestMapping("/subStock")
    String subStock();

    /**
     * 库存新增
     *
     * @return
     */
    @RequestMapping("/addStock")
    String addStock();
}
