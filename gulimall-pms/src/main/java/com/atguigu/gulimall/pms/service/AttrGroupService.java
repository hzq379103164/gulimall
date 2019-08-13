package com.atguigu.gulimall.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.atguigu.gulimall.pms.entity.AttrGroupEntity;
import com.atguigu.gulimall.commons.bean.PageVo;
import com.atguigu.gulimall.commons.bean.QueryCondition;


/**
 * 属性分组
 *
 * @author Hezhiqiang
 * @email hzq@job.com
 * @date 2019-08-01 19:32:14
 */
public interface AttrGroupService extends IService<AttrGroupEntity> {

    PageVo queryPage(QueryCondition params);

    PageVo getCategoryAttrGroups(QueryCondition queryCondition, Long catId);

    //根据属性Id找到分组信息
    AttrGroupEntity getGroupInfoByAttrId(Long attrId);
}

