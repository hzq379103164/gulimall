package com.atguigu.gulimall.oms.controller;

import com.atguigu.gulimall.oms.feign.WorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hezhiqiang
 * @TCH163job.com
 * @date 2019/8/2 13:03
 */
@RefreshScope  //可以从配置中心动态的获取配置参数
@RestController
public class HelloController {

    @Autowired
    WorldService worldService;

    @Value("${my.content}")
    private String content = "";


    //声明式调用
    @GetMapping("/hello")
    public String hello(){



        String msg = "";
        msg = worldService.world();
        return "hello"+msg + "" + content;
    }
}
