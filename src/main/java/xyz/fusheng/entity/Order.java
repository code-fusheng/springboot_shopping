/**
 * Copyright (C), 2020-2020, code_fusheng
 * FileName: Order
 * Author:   25610
 * Date:     2020/2/6 13:34
 * Description: 实体 Order 订单类
 * History:
 * <author>        <time>      <version>       <desc>
 * 作者姓名       修改时间       版本号         描述
 */
package xyz.fusheng.entity;

import lombok.Data;
import java.util.Date;
import java.util.List;

@Data
public class Order {
    private Integer id;
    private Integer userId;                         // 用户Id
    private String userAddress;                     // 用户地址
    private Date createTime;                        // 订单创建时间
    private Integer cost;                           // 费用
    private String serialNumber;
    private List<OrderDetail> orderDetails;         // 订单详情列表
}
