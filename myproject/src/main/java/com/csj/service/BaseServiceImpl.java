package com.csj.service;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * @description:
 * @author: jims wang
 * @createdate: 2019-08-28 09:02:12
 **/
public class BaseServiceImpl<T> implements BaseService<T> {
    @Autowired
    Mapper<T> mapper;

    @Override
    public int deleteByPrimaryKey(Object o) {
        return mapper.deleteByPrimaryKey(o);
    }

    @Override
    public int delete(T t) {
        return mapper.delete(t);
    }

    @Override
    public int insert(T t) {
        return mapper.insert(t);
    }

    @Override
    public int insertSelective(T t) {
        return mapper.insertSelective(t);
    }

    @Override
    public boolean existsWithPrimaryKey(Object o) {
        return mapper.existsWithPrimaryKey(o);
    }

    @Override
    public List<T> selectAll() {
        return mapper.selectAll();
    }

    @Override
    public PageInfo<T> selectPage(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<T> list = this.selectAll();
        return PageInfo.of(list);
    }

    @Override
    public PageInfo<T> selectPage(T t,Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<T> list = this.select(t);
        return PageInfo.of(list);
    }

    @Override
    public T selectByPrimaryKey(Object o) {
        return mapper.selectByPrimaryKey(o);
    }

    @Override
    public int selectCount(T t) {
        return mapper.selectCount(t);
    }

    @Override
    public List<T> select(T t) {
        return mapper.select(t);
    }

    @Override
    public T selectOne(T t) {
        return mapper.selectOne(t);
    }

    @Override
    public int updateByPrimaryKey(T t) {
        return mapper.updateByPrimaryKey(t);
    }

    @Override
    public int updateByPrimaryKeySelective(T t) {
        return mapper.updateByPrimaryKeySelective(t);
    }
}
