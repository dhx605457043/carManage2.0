package com.car.manage.service.impl;


import com.car.manage.dao.LicenseplatearealistDao;
import com.car.manage.entity.Licenseplatearealist;
import com.car.manage.service.LicenseplatearealistService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * (Licenseplatearealist)表服务实现类
 *
 * @author makejava
 * @since 2020-05-13 11:18:43
 */
@Service("licenseplatearealistService")
public class LicenseplatearealistServiceImpl implements LicenseplatearealistService {
    @Resource
    private LicenseplatearealistDao licenseplatearealistDao;

    /**
     * 通过ID查询单条数据
     *
     * @param licenseplateareacode 主键
     * @return 实例对象
     */
    @Override
    public Licenseplatearealist queryById(Integer licenseplateareacode) {
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
    public List<Licenseplatearealist> queryAllByLimit(int offset, int limit) {
        return null;
    }

    /**
     * 新增数据
     *
     * @param licenseplatearealist 实例对象
     * @return 实例对象
     */
    @Override
    public Licenseplatearealist insert(Licenseplatearealist licenseplatearealist) {
        this.licenseplatearealistDao.insert(licenseplatearealist);
        return licenseplatearealist;
    }

    /**
     * 修改数据
     *
     * @param licenseplatearealist 实例对象
     * @return 实例对象
     */
    @Override
    public Licenseplatearealist update(Licenseplatearealist licenseplatearealist) {
//        this.licenseplatearealistDao.update(licenseplatearealist);
        return this.queryById(licenseplatearealist.getLicenseplateareacode());
    }

    /**
     * 通过主键删除数据
     *
     * @param licenseplateareacode 主键
     * @return 是否成功
     */
    @Override
    public boolean deleteById(Integer licenseplateareacode) {
        return true;
    }
}