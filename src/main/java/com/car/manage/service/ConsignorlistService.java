package com.car.manage.service;

import com.car.manage.entity.Consignorlist;

import java.util.List;

/**
 * (Consignorlist)表服务接口
 *
 * @author makejava
 * @since 2020-05-13 11:18:43
 */
public interface ConsignorlistService {

    /**
     * 通过ID查询单条数据
     *
     * @param consignorid 主键
     * @return 实例对象
     */
    Consignorlist queryById(Integer consignorid);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Consignorlist> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param consignorlist 实例对象
     * @return 实例对象
     */
    Consignorlist insert(Consignorlist consignorlist);

    /**
     * 修改数据
     *
     * @param consignorlist 实例对象
     * @return 实例对象
     */
    Consignorlist update(Consignorlist consignorlist);

    /**
     * 通过主键删除数据
     *
     * @param consignorid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer consignorid);

}