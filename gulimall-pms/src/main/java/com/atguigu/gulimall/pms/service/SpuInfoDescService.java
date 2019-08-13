package com.atguigu.gulimall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gulimall.pms.entity.SpuInfoDescEntity;
import com.atguigu.gulimall.commons.bean.PageVo;
import com.atguigu.gulimall.commons.bean.QueryCondition;


/**
 * spu信息介绍
 *
 * @author Hezhiqiang
 * @email hzq@job.com
 * @date 2019-08-01 19:32:14
 */
public interface SpuInfoDescService extends IService<SpuInfoDescEntity> {

    PageVo queryPage(QueryCondition params);

    void saveSpuInfoImages(Long spuId, String[] spuImages);
}

