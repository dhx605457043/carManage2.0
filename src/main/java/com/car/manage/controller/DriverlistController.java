package com.car.manage.controller;

import com.car.manage.entity.Driverlist;
import com.car.manage.service.DriverlistService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (Driverlist)表控制层
 *
 * @author makejava
 * @since 2020-05-13 11:18:43
 */
@RestController
@RequestMapping("driverlist")
public class DriverlistController {
    /**
     * 服务对象
     */
    @Resource
    private DriverlistService driverlistService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Driverlist selectOne(Integer id) {
        return this.driverlistService.queryById(id);
    }

}