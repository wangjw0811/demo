package com.csj.service;

import com.github.pagehelper.PageInfo;
import tk.mybatis.mapper.common.BaseMapper;


/**
 * @description:
 * @author: jims wang
 * @createdate: 2019-08-28 09:25:50
 **/
public interface BaseService<T> extends BaseMapper<T> {

    PageInfo<T> selectPage(Integer PageNum, Integer pageSize);

    PageInfo<T> selectPage(T t, Integer PageNum, Integer pageSize);

}
