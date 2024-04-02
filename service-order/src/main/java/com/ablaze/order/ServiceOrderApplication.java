package com.ablaze.order;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.context.metrics.buffering.BufferingApplicationStartup;

/**
 * @author seecin
 * @title ServiceOrderApplication
 * @date 2024/4/2 15:01
 * @Description
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class ServiceOrderApplication {

    public static void main(String[] args) {
        // 标记 sentinel 类型为 网关
        // System.setProperty("csp.sentinel.app.type", "1");
        SpringApplication application = new SpringApplication(ServiceOrderApplication.class);
        application.setApplicationStartup(new BufferingApplicationStartup(2048));
        application.run(args);
        System.out.println("(♥◠‿◠)ﾉﾞ  ServiceStock启动成功   ლ(´ڡ`ლ)ﾞ  ");
    }
}
