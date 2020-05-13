package com.car.manage.controller;

import com.car.manage.entity.Cargolist;
import com.car.manage.service.CargolistService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Cargolist)表控制层
 *
 * @author makejava
 * @since 2020-05-13 11:18:42
 */
@RestController
@RequestMapping("cargolist")
public class CargolistController {
    /**
     * 服务对象
     */
    @Resource
    private CargolistService cargolistService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Cargolist selectOne(Integer id) {
        return this.cargolistService.queryById(id);
    }

}