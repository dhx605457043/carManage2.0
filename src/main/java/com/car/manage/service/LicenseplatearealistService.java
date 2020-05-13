package com.car.manage.service;

import com.car.manage.entity.Licenseplatearealist;

import java.util.List;

/**
 * (Licenseplatearealist)表服务接口
 *
 * @author makejava
 * @since 2020-05-13 11:18:43
 */
public interface LicenseplatearealistService {

    /**
     * 通过ID查询单条数据
     *
     * @param licenseplateareacode 主键
     * @return 实例对象
     */
    Licenseplatearealist queryById(Integer licenseplateareacode);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Licenseplatearealist> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param licenseplatearealist 实例对象
     * @return 实例对象
     */
    Licenseplatearealist insert(Licenseplatearealist licenseplatearealist);

    /**
     * 修改数据
     *
     * @param licenseplatearealist 实例对象
     * @return 实例对象
     */
    Licenseplatearealist update(Licenseplatearealist licenseplatearealist);

    /**
     * 通过主键删除数据
     *
     * @param licenseplateareacode 主键
     * @return 是否成功
     */
    boolean deleteById(Integer licenseplateareacode);

}