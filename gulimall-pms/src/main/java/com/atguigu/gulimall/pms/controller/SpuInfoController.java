package com.atguigu.gulimall.pms.controller;

import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Map;


import com.atguigu.gulimall.commons.bean.PageVo;
import com.atguigu.gulimall.commons.bean.QueryCondition;
import com.atguigu.gulimall.commons.bean.Resp;
import com.atguigu.gulimall.pms.vo.SpuAllSaveVo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import com.atguigu.gulimall.pms.entity.SpuInfoEntity;
import com.atguigu.gulimall.pms.service.SpuInfoService;





/**
 * spu信息
 *
 * @author Hezhiqiang
 * @email hzq@job.com
 * @date 2019-08-01 19:32:14
 */
@Api(tags = "spu信息 管理")
@RestController
@RequestMapping("pms/spuinfo")
public class SpuInfoController {
    @Autowired
    private SpuInfoService spuInfoService;

    /**
     * /pms/spuinfo/updateStatus/{spuId}
     */
    @ApiOperation("商品上架/下架")
    @GetMapping("/updateStatus/{spuId}")
    public Resp<Object> updateSpuStatus(@RequestParam("status") Integer status,
                                        @PathVariable("spuId") Long spuId){
        //

        spuInfoService.updateSpuStatus(spuId,status);

        return Resp.ok(null);
    }


    @GetMapping("/simple/search")
    public Resp<Object> querySpuInfoPage(QueryCondition queryCondition,
                                         @RequestParam(value = "catId",defaultValue = "0") Long catId){
        PageVo page = spuInfoService.queryPageByCatId(queryCondition,catId);

        return Resp.ok(page);
    }

    /**
     * 列表
     */
    @ApiOperation("分页查询(排序)")
    @GetMapping("/list")
    @PreAuthorize("hasAuthority('pms:spuinfo:list')")
    public Resp<PageVo> list(QueryCondition queryCondition) {
        PageVo page = spuInfoService.queryPage(queryCondition);

        return Resp.ok(page);
    }


    /**
     * 信息
     */
    @ApiOperation("详情查询")
    @GetMapping("/info/{id}")
    @PreAuthorize("hasAuthority('pms:spuinfo:info')")
    public Resp<SpuInfoEntity> info(@PathVariable("id") Long id){
        SpuInfoEntity spuInfo = spuInfoService.getById(id);

        return Resp.ok(spuInfo);
    }

    /**
     * 保存
     */
    @ApiOperation("保存")
    @PostMapping("/save")
    @PreAuthorize("hasAuthority('pms:spuinfo:save')")
    public Resp<Object> save(@RequestBody SpuAllSaveVo spuInfo) throws Exception {
        //spuInfoService.save(spuInfo);

        //数据存储到数据库，数据落盘
        spuInfoService.spuBigSaveAll(spuInfo);

        return Resp.ok(null);
    }
//    /**
//     * 保存
//     */
//    @ApiOperation("保存")
//    @PostMapping("/save")
//    @PreAuthorize("hasAuthority('pms:spuinfo:save')")
//    public Resp<Object> save(@RequestBody SpuInfoEntity spuInfo){
//        spuInfoService.save(spuInfo);
//
//        return Resp.ok(null);
//    }
    /**
     * 修改
     */
    @ApiOperation("修改")
    @PostMapping("/update")
    @PreAuthorize("hasAuthority('pms:spuinfo:update')")
    public Resp<Object> update(@RequestBody SpuAllSaveVo spuInfo){
		spuInfoService.updateById(spuInfo);

        return Resp.ok(null);
    }

    /**
     * 删除
     */
    @ApiOperation("删除")
    @PostMapping("/delete")
    @PreAuthorize("hasAuthority('pms:spuinfo:delete')")
    public Resp<Object> delete(@RequestBody Long[] ids){
        spuInfoService.removeByIds(Arrays.asList(ids));

        return Resp.ok(null);
    }

}
