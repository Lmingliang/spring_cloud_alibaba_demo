package com.ablaze.ribbon;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author seecin
 * @title RibbonRuleConfig
 * @date 2024/4/2 15:04
 * @Description RibbonRuleConfig不能被@SpringBootApplication的@ComponentScan扫描到，否则就是全局配置的效果
 */
@Configuration
public class RibbonRuleConfig {

    /**
     * 全局配置，指定负载均衡策略
     * @return
     */
    // @Bean
    // public IRule iRule(){// 方法名一定叫iRule，遵循约定大于配置
    // 使用随机负载均衡策略
    //     return new RandomRule();
    // 指定使用Nacos提供的负载均衡策略（优先调用统一集群的实例，基于随机权重）
    //     //return new NacosRule();
    // }
}
