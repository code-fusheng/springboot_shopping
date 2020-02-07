/**
 * Copyright (C), 2020-2020, code_fusheng
 * FileName: OrderDetail
 * Author:   25610
 * Date:     2020/2/6 13:37
 * Description: 订单详情 OrderDetail 实体类
 * History:
 * <author>        <time>      <version>       <desc>
 * 作者姓名       修改时间       版本号         描述
 */
package xyz.fusheng.entity;

import lombok.Data;

@Data
public class OrderDetail {
    private Integer id;
    private Order order;                        // 订单对象
    private Product product;                    // 商品对象
    private Integer quantity;                   // 数量
    private Integer cost;                       // 费用
}
