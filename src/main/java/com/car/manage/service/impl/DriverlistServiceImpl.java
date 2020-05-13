package com.car.manage.service.impl;


import com.car.manage.dao.DriverlistDao;
import com.car.manage.entity.Driverlist;
import com.car.manage.service.DriverlistService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Driverlist)表服务实现类
 *
 * @author makejava
 * @since 2020-05-13 11:18:43
 */
@Service("driverlistService")
public class DriverlistServiceImpl implements DriverlistService {
    @Resource
    private DriverlistDao driverlistDao;

    /**
     * 通过ID查询单条数据
     *
     * @param driverid 主键
     * @return 实例对象
     */
    @Override
    public Driverlist queryById(Integer driverid) {
        return null;
    }

    /**
     * 查询多条数据
     *
     * @param offset 查询起始位置
     * @param limit 查询条数
     * @return 对象列表
     */
    @Override
    public List<Driverlist> queryAllByLimit(int offset, int limit) {
        return null;
    }

    /**
     * 新增数据
     *
     * @param driverlist 实例对象
     * @return 实例对象
     */
    @Override
    public Driverlist insert(Driverlist driverlist) {
        this.driverlistDao.insert(driverlist);
        return driverlist;
    }

    /**
     * 修改数据
     *
     * @param driverlist 实例对象
     * @return 实例对象
     */
    @Override
    public Driverlist update(Driverlist driverlist) {
//        this.driverlistDao.update(driverlist);
        return this.queryById(driverlist.getDriverid());
    }

    /**
     * 通过主键删除数据
     *
     * @param driverid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer driverid) {
        return true;
    }
}