package com.car.manage.controller;

import com.car.manage.entity.Consignorlist;
import com.car.manage.service.ConsignorlistService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (Consignorlist)表控制层
 *
 * @author makejava
 * @since 2020-05-13 11:18:43
 */
@RestController
@RequestMapping("consignorlist")
public class ConsignorlistController {
    /**
     * 服务对象
     */
    @Resource
    private ConsignorlistService consignorlistService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Consignorlist selectOne(Integer id) {
        return this.consignorlistService.queryById(id);
    }

}