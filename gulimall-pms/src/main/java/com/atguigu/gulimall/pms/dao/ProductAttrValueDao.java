package com.atguigu.gulimall.pms.dao;

import com.atguigu.gulimall.pms.entity.ProductAttrValueEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * spu属性值
 * 
 * @author Hezhiqiang
 * @email hzq@job.com
 * @date 2019-08-01 19:32:14
 */
@Mapper
public interface ProductAttrValueDao extends BaseMapper<ProductAttrValueEntity> {

    void insertBatch(@Param("baseAttrs") List<ProductAttrValueEntity> allSave);

}
