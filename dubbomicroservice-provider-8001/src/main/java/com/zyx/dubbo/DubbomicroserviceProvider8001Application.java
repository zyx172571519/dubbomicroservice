package com.zyx.dubbo;
import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
@EnableDubbo
public class DubbomicroserviceProvider8001Application {
    public static void main(String[] args) {
        SpringApplication.run(DubbomicroserviceProvider8001Application.class, args);
    }
}
