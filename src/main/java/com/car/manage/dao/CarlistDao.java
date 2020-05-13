package com.car.manage.dao;


import com.car.manage.entity.Carlist;
import tk.mybatis.mapper.common.BaseMapper;
import tk.mybatis.mapper.common.Mapper;

/**
 * (Carlist)表数据库访问层
 *
 * @author makejava
 * @since 2020-05-13 11:18:43
 */
public interface CarlistDao extends Mapper<Carlist>, BaseMapper<Carlist> {


}