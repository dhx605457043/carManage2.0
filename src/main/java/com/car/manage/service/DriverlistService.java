package com.car.manage.service;

import com.car.manage.entity.Driverlist;

import java.util.List;

/**
 * (Driverlist)表服务接口
 *
 * @author makejava
 * @since 2020-05-13 11:18:43
 */
public interface DriverlistService {

    /**
     * 通过ID查询单条数据
     *
     * @param driverid 主键
     * @return 实例对象
     */
    Driverlist queryById(Integer driverid);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Driverlist> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param driverlist 实例对象
     * @return 实例对象
     */
    Driverlist insert(Driverlist driverlist);

    /**
     * 修改数据
     *
     * @param driverlist 实例对象
     * @return 实例对象
     */
    Driverlist update(Driverlist driverlist);

    /**
     * 通过主键删除数据
     *
     * @param driverid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer driverid);

}