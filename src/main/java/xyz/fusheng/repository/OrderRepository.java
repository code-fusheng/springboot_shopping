/**
 * Copyright (C), 2020-2020, code_fusheng
 * FileName: OrderRepository
 * Author:   25610
 * Date:     2020/2/6 20:55
 * Description: 订单 oreder 仓库类
 * History:
 * <author>        <time>      <version>       <desc>
 * 作者姓名       修改时间       版本号         描述
 */
package xyz.fusheng.repository;

import xyz.fusheng.entity.Order;
import xyz.fusheng.entity.OrderDetail;

import java.util.List;

public interface OrderRepository {
    // 添加订单
    public void addOrder(Order order);
    // 添加订单详情
    public void addOrderDetail(OrderDetail orderDetail);
    public int getOrderId();
    // 根据订单id查询订单详情
    public List<OrderDetail> findByOrderId(int orderId);
    // 根据用户id查询订单
    public List<Order> findByUserId(int userId);
    // 根据订单id查询订单享详情
    public List<OrderDetail> findOrderDetailByOrderId(int orderId);
}
