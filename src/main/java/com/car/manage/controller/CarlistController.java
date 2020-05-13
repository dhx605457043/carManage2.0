package com.car.manage.controller;

import com.car.manage.entity.Carlist;
import com.car.manage.service.CarlistService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Carlist)表控制层
 *
 * @author makejava
 * @since 2020-05-13 11:18:43
 */
@RestController
@RequestMapping("carlist")
public class CarlistController {
    /**
     * 服务对象
     */
    @Resource
    private CarlistService carlistService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Carlist selectOne(Integer id) {
        return this.carlistService.queryById(id);
    }

}