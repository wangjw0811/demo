package com.csj.mapper;

import com.csj.entity.OrderInfo;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface OrderInfoMapper extends Mapper<OrderInfo> {

   List<OrderInfo> mySearch();

}