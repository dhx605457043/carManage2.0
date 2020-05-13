package com.car.manage.service;

import com.car.manage.entity.Cargolist;
import java.util.List;

/**
 * (Cargolist)表服务接口
 *
 * @author makejava
 * @since 2020-05-13 11:18:42
 */
public interface CargolistService {

    /**
     * 通过ID查询单条数据
     *
     * @param cargoid 主键
     * @return 实例对象
     */
    Cargolist queryById(Integer cargoid);

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    List<Cargolist> queryAllByLimit(int offset, int limit);

    /**
     * 新增数据
     *
     * @param cargolist 实例对象
     * @return 实例对象
     */
    Cargolist insert(Cargolist cargolist);

    /**
     * 修改数据
     *
     * @param cargolist 实例对象
     * @return 实例对象
     */
    Cargolist update(Cargolist cargolist);

    /**
     * 通过主键删除数据
     *
     * @param cargoid 主键
     * @return 是否成功
     */
    boolean deleteById(Integer cargoid);

}