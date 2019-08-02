package com.atguigu.gulimall.pms.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hezhiqiang
 * @TCH163job.com
 * @date 2019/8/2 13:06
 */
@RestController
public class WorldController {

    @Value("${spring.datasource.url}")
    private String val;

    @GetMapping("/world")
    public String world(){
        //省略service调用
        String msg = "world";
        return msg;
    }
}
