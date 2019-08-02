package com.atguigu.gulimall.oms.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author hezhiqiang
 * @TCH163job.com
 * @date 2019/8/2 13:10
 */
@Service
@FeignClient(name = "gulimall-pms")
public interface WorldService {

    @GetMapping("/world")
    public String world();

}
