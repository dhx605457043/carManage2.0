package com.car.manage.controller;


import com.car.manage.entity.Licenseplatearealist;
import com.car.manage.service.LicenseplatearealistService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * (Licenseplatearealist)表控制层
 *
 * @author makejava
 * @since 2020-05-13 11:18:43
 */
@RestController
@RequestMapping("licenseplatearealist")
public class LicenseplatearealistController {
    /**
     * 服务对象
     */
    @Resource
    private LicenseplatearealistService licenseplatearealistService;

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("selectOne")
    public Licenseplatearealist selectOne(Integer id) {
        return this.licenseplatearealistService.queryById(id);
    }

}