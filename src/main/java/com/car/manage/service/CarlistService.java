package com.car.manage.service;

import com.car.manage.entity.Carlist;

import java.util.List;

/**
 * (Carlist)表服务接口
 *
 * @author makejava
 * @since 2020-05-13 11:18:43
 */
public interface CarlistService {

    /**
     * 通过ID查询单条数据
     *
     * @param carid 主键
     * @return 实例对象
     */
    Carlist queryById(Integer carid);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Carlist> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param carlist 实例对象
     * @return 实例对象
     */
    Carlist insert(Carlist carlist);

    /**
     * 修改数据
     *
     * @param carlist 实例对象
     * @return 实例对象
     */
    Carlist update(Carlist carlist);

    /**
     * 通过主键删除数据
     *
     * @param carid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer carid);

}