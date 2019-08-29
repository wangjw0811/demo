package com.service;

import com.entity.OrderInfo;

import java.util.List;

/**
 * @description:
 * @author: jims wang
 * @createdate: 2019-08-28 08:58:06
 **/
public interface IOrderInfoService extends BaseService<OrderInfo> {

    List<OrderInfo> mySearch();

}
