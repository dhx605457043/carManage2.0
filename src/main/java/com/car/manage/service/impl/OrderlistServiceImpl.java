package com.car.manage.service.impl;


import com.car.manage.dao.OrderlistDao;
import com.car.manage.entity.Orderlist;
import com.car.manage.service.OrderlistService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Orderlist)表服务实现类
 *
 * @author makejava
 * @since 2020-05-13 11:18:43
 */
@Service("orderlistService")
public class OrderlistServiceImpl implements OrderlistService {
    @Resource
    private OrderlistDao orderlistDao;

    /**
     * 通过ID查询单条数据
     *
     * @param orderid 主键
     * @return 实例对象
     */
    @Override
    public Orderlist queryById(Integer orderid) {
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
    public List<Orderlist> queryAllByLimit(int offset, int limit) {
        return null;
    }

    /**
     * 新增数据
     *
     * @param orderlist 实例对象
     * @return 实例对象
     */
    @Override
    public Orderlist insert(Orderlist orderlist) {
        this.orderlistDao.insert(orderlist);
        return orderlist;
    }

    /**
     * 修改数据
     *
     * @param orderlist 实例对象
     * @return 实例对象
     */
    @Override
    public Orderlist update(Orderlist orderlist) {
//        this.orderlistDao.update(orderlist);
        return this.queryById(orderlist.getOrderid());
    }

    /**
     * 通过主键删除数据
     *
     * @param orderid 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer orderid) {
        return true;
    }
}