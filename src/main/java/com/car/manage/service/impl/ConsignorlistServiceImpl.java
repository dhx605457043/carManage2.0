package com.car.manage.service.impl;


import com.car.manage.dao.ConsignorlistDao;
import com.car.manage.entity.Consignorlist;
import com.car.manage.service.ConsignorlistService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Consignorlist)表服务实现类
 *
 * @author makejava
 * @since 2020-05-13 11:18:43
 */
@Service("consignorlistService")
public class ConsignorlistServiceImpl implements ConsignorlistService {
    @Resource
    private ConsignorlistDao consignorlistDao;

    /**
     * 通过ID查询单条数据
     *
     * @param consignorid 主键
     * @return 实例对象
     */
    @Override
    public Consignorlist queryById(Integer consignorid) {
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
    public List<Consignorlist> queryAllByLimit(int offset, int limit) {
        return null;
    }

    /**
     * 新增数据
     *
     * @param consignorlist 实例对象
     * @return 实例对象
     */
    @Override
    public Consignorlist insert(Consignorlist consignorlist) {
        this.consignorlistDao.insert(consignorlist);
        return consignorlist;
    }

    /**
     * 修改数据
     *
     * @param consignorlist 实例对象
     * @return 实例对象
     */
    @Override
    public Consignorlist update(Consignorlist consignorlist) {
//        this.consignorlistDao.update(consignorlist);
        return this.queryById(consignorlist.getConsignorid());
    }

    /**
     * 通过主键删除数据
     *
     * @param consignorid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer consignorid) {
        return true;
    }
}