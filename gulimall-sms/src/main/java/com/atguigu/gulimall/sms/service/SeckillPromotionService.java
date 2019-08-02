package com.atguigu.gulimall.sms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gulimall.sms.entity.SeckillPromotionEntity;
import com.atguigu.gulimall.commons.bean.PageVo;
import com.atguigu.gulimall.commons.bean.QueryCondition;


/**
 * 秒杀活动
 *
 * @author Hezhiqiang
 * @email hzq@job.com
 * @date 2019-08-01 23:36:41
 */
public interface SeckillPromotionService extends IService<SeckillPromotionEntity> {

    PageVo queryPage(QueryCondition params);
}

