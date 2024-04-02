package com.ablaze.nacos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.context.metrics.buffering.BufferingApplicationStartup;

/**
 * @author seecin
 * @title CloudNacosApplication
 * @date 2024/4/2 14:46
 * @Description
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class CloudNacosApplication {

    public static void main(String[] args) {
        // 标记 sentinel 类型为 网关
        // System.setProperty("csp.sentinel.app.type", "1");
        SpringApplication application = new SpringApplication(CloudNacosApplication.class);
        application.setApplicationStartup(new BufferingApplicationStartup(2048));
        application.run(args);
        System.out.println("(♥◠‿◠)ﾉﾞ  Nacos启动成功   ლ(´ڡ`ლ)ﾞ  ");
    }
}
