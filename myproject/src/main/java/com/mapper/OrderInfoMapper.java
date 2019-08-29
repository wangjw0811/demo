package com.mapper;

import com.entity.OrderInfo;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

public interface OrderInfoMapper extends Mapper<OrderInfo> {

   List<OrderInfo> mySearch();

}