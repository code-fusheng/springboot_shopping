/**
 * Copyright (C), 2020-2020, code_fusheng
 * FileName: OrderService
 * Author:   25610
 * Date:     2020/2/6 23:01
 * Description: 订单 Order 业务接口
 * History:
 * <author>        <time>      <version>       <desc>
 * 作者姓名       修改时间       版本号         描述
 */
package xyz.fusheng.service;

import xyz.fusheng.entity.Order;
import xyz.fusheng.entity.OrderDetail;

import java.util.List;

public interface OrderService {
    public Order addOrder(int userId, String userAddress, int cost);
    public List<OrderDetail> findByOrderId(int orderId);
    public List<Order> findByUserId(int userId);
}
