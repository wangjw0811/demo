package com.csj.service.impl;

import com.csj.entity.OrderInfo;
import com.csj.mapper.OrderInfoMapper;
import com.csj.service.BaseServiceImpl;
import com.csj.service.IOrderInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @description:
 * @author: jims wang
 * @createdate: 2019-08-28 09:32:56
 **/
@Service
public class OrderInfoServiceImpl extends BaseServiceImpl<OrderInfo> implements IOrderInfoService {

    @Resource
    OrderInfoMapper orderInfoMapper;

    @Override
    public List<OrderInfo> mySearch() {
        return orderInfoMapper.mySearch();
    }
}
