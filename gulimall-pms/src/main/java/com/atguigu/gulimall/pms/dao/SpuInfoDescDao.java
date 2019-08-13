package com.atguigu.gulimall.pms.dao;

import com.atguigu.gulimall.pms.entity.SpuInfoDescEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * spu信息介绍
 * 
 * @author Hezhiqiang
 * @email hzq@job.com
 * @date 2019-08-01 19:32:14
 */
@Mapper
public interface SpuInfoDescDao extends BaseMapper<SpuInfoDescEntity> {

    void insertInfo(@Param("entity") SpuInfoDescEntity entity);
}
