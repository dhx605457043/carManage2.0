package com.car.manage.service.impl;



import com.car.manage.dao.CargolistDao;
import com.car.manage.entity.Cargolist;
import com.car.manage.service.CargolistService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Cargolist)表服务实现类
 *
 * @author makejava
 * @since 2020-05-13 11:18:42
 */
@Service()
public class CargolistServiceImpl implements CargolistService {
    @Resource
    private CargolistDao cargolistDao;

    /**
     * 通过ID查询单条数据
     *
     * @param cargoid 主键
     * @return 实例对象
     */
    @Override
    public Cargolist queryById(Integer cargoid) {
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
    public List<Cargolist> queryAllByLimit(int offset, int limit) {
        return null;
    }

    /**
     * 新增数据
     *
     * @param cargolist 实例对象
     * @return 实例对象
     */
    @Override
    public Cargolist insert(Cargolist cargolist) {
        this.cargolistDao.insert(cargolist);
        return cargolist;
    }

    /**
     * 修改数据
     *
     * @param cargolist 实例对象
     * @return 实例对象
     */
    @Override
    public Cargolist update(Cargolist cargolist) {
//        this.cargolistDao.update(cargolist);
        return this.queryById(cargolist.getCargoid());
    }

    /**
     * 通过主键删除数据
     *
     * @param cargoid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer cargoid) {
        return true;
    }
}