package com.car.manage.controller;


import com.car.manage.entity.Orderlist;
import com.car.manage.service.OrderlistService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (Orderlist)表控制层
 *
 * @author makejava
 * @since 2020-05-13 11:18:43
 */
@RestController
@RequestMapping("orderlist")
public class OrderlistController {
    /**
     * 服务对象
     */
    @Resource
    private OrderlistService orderlistService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Orderlist selectOne(Integer id) {
        return this.orderlistService.queryById(id);
    }

}