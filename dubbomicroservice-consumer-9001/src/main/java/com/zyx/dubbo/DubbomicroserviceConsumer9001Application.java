package com.zyx.dubbo;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import com.alibaba.dubbo.config.spring.context.annotation.EnableDubboConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo
public class DubbomicroserviceConsumer9001Application {

    public static void main(String[] args) {
        SpringApplication.run(DubbomicroserviceConsumer9001Application.class, args);
    }

}
