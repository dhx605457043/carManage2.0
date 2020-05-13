package com.car.manage.service;

import com.car.manage.entity.Orderlist;

import java.util.List;

/**
 * (Orderlist)表服务接口
 *
 * @author makejava
 * @since 2020-05-13 11:18:43
 */
public interface OrderlistService {

    /**
     * 通过ID查询单条数据
     *
     * @param orderid 主键
     * @return 实例对象
     */
    Orderlist queryById(Integer orderid);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Orderlist> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param orderlist 实例对象
     * @return 实例对象
     */
    Orderlist insert(Orderlist orderlist);

    /**
     * 修改数据
     *
     * @param orderlist 实例对象
     * @return 实例对象
     */
    Orderlist update(Orderlist orderlist);

    /**
     * 通过主键删除数据
     *
     * @param orderid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer orderid);

}