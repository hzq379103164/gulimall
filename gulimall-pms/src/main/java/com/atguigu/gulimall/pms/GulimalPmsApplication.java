package com.atguigu.gulimall.pms;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
@EnableAspectJAutoProxy(exposeProxy=true)
@EnableTransactionManagement//开启基于注解的事物功能
@RefreshScope
@MapperScan("com.atguigu.gulimall.pms.dao")
@SpringBootApplication
public class GulimalPmsApplication {

    public static void main(String[] args) {
        SpringApplication.run(GulimalPmsApplication.class, args);
    }

}
