package com.shop4j.cloud.common.database.config;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author ksying
 * @date 2023/3/12 14:42
 */
@Configuration
@MapperScan({ "com.mall4j.cloud.**.mapper" })
public class MybatisConfig {


}
