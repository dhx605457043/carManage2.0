package com.car.manage.service.impl;


import com.car.manage.dao.CarlistDao;
import com.car.manage.entity.Carlist;
import com.car.manage.service.CarlistService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Carlist)表服务实现类
 *
 * @author makejava
 * @since 2020-05-13 11:18:43
 */
@Service("carlistService")
public class CarlistServiceImpl implements CarlistService {
    @Resource
    private CarlistDao carlistDao;

    /**
     * 通过ID查询单条数据
     *
     * @param carid 主键
     * @return 实例对象
     */
    @Override
    public Carlist queryById(Integer carid) {
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
    public List<Carlist> queryAllByLimit(int offset, int limit) {
        return null;
    }

    /**
     * 新增数据
     *
     * @param carlist 实例对象
     * @return 实例对象
     */
    @Override
    public Carlist insert(Carlist carlist) {
        this.carlistDao.insert(carlist);
        return carlist;
    }

    /**
     * 修改数据
     *
     * @param carlist 实例对象
     * @return 实例对象
     */
    @Override
    public Carlist update(Carlist carlist) {
//        this.carlistDao.update(carlist);
        return this.queryById(carlist.getCarid());
    }

    /**
     * 通过主键删除数据
     *
     * @param carid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer carid) {
        return true;
    }
}