package com.controller;

import com.entity.OrderInfo;
import com.github.pagehelper.PageInfo;
import com.service.IOrderInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @description:
 * @author: jims wang
 * @createdate: 2019-08-28 16:30:15
 **/
@RestController
@RequestMapping("orderInfo")
public class OrderInfoController {

    @Autowired
    IOrderInfoService orderInfoService;

    // 新建订单
    @PostMapping
    public String insert(@RequestBody OrderInfo orderInfo){
        int i = orderInfoService.insert(orderInfo);
        if(i == 1){
            return String.format("保存成功，生成的id为 %s",orderInfo.getOrderId());
        }
        return String.format("保存失败");
    }

    // 根据主键删除订单
    @DeleteMapping("{orderId}")
    public String deleteByOrderId(@PathVariable int orderId){
        int i = orderInfoService.deleteByPrimaryKey(orderId);
        if(i == 1){
            return String.format("id为%s的订单删除成功",orderId);
        }
        return String.format("删除失败");
    }

    // 根据主键id查询订单
    @GetMapping("{orderId}")
    public OrderInfo selectByPrimaryKey(@PathVariable int orderId){
        OrderInfo orderInfo = orderInfoService.selectByPrimaryKey(orderId);
        return orderInfo;
    }

    // 根据订单号查询订单
    @GetMapping("orderNumber/{orderNumber}")
    public OrderInfo selectOne(@PathVariable String orderNumber){
        OrderInfo orderInfo = new OrderInfo();
        orderInfo.setOrderNumber(orderNumber);
        orderInfo = orderInfoService.selectOne(orderInfo);
        return orderInfo;
    }

    // 查询所有订单列表
    @GetMapping
    public List<OrderInfo> selectAll(){
        return orderInfoService.selectAll();
    }

    // 查询条件搜索订单列表
    @PostMapping("withConditions")
    public List<OrderInfo> selectAllByConditions(@RequestBody OrderInfo orderInfo){
        return orderInfoService.select(orderInfo);
    }

    // 测试自定义mapper
    @GetMapping("mySearch")
    public List<OrderInfo> mySearch(){
        return orderInfoService.mySearch();
    }

    // 分页查询订列表
    @GetMapping("{pageNum}/{pageSize}")
    public PageInfo<OrderInfo> selectPage(@PathVariable Integer pageNum,@PathVariable Integer pageSize){
        return orderInfoService.selectPage(pageNum,pageSize);
    }

    // 分页查询条件搜索订单列表
    @PostMapping("withConditions/{pageNum}/{pageSize}")
    public PageInfo<OrderInfo> selectPage(@RequestBody OrderInfo orderInfo,@PathVariable Integer pageNum,@PathVariable Integer pageSize){
        return orderInfoService.selectPage(orderInfo,pageNum,pageSize);
    }

    // 修改订单信息
    @PutMapping
    public String update(@RequestBody OrderInfo orderInfo){
        int i = orderInfoService.updateByPrimaryKey(orderInfo);
        if(i == 1){
            return String.format("修改成功");
        }
        return String.format("修改失败");
    }
}
