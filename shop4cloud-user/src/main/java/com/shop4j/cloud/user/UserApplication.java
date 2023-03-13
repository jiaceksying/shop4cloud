package com.shop4j.cloud.user;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 卖家用户服务
 *
 * @author amoswang
 * @date 2023/3/8 22:36:00
 */
@EnableDubbo
@SpringBootApplication
@MapperScan("com.shop4j.cloud.user.mapper")
public class UserApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserApplication.class, args);
    }

}
