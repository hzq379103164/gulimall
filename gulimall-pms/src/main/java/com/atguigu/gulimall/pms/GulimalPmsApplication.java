package com.atguigu.gulimall.pms;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
@RefreshScope
@EnableSwagger2
@MapperScan("com.atguigu.gulimall.pms.dao")
@SpringBootApplication
public class GulimalPmsApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimalPmsApplication.class, args);
    }

}
