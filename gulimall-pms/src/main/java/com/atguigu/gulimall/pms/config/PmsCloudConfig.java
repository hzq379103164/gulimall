package com.atguigu.gulimall.pms.config;

import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

/**
 * @author hezhiqiang
 * @TCH163job.com
 * @date 2019/8/2 12:35
 */

@Configuration
@EnableDiscoveryClient
@EnableFeignClients("com.atguigu.gulimall.pms.feign")
public class PmsCloudConfig {
}
