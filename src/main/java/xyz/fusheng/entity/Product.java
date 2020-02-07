/**
 * Copyright (C), 2020-2020, code_fusheng
 * FileName: Product
 * Author:   25610
 * Date:     2020/2/6 13:38
 * Description: 商品 Product 实体类
 * History:
 * <author>        <time>      <version>       <desc>
 * 作者姓名       修改时间       版本号         描述
 */
package xyz.fusheng.entity;

import lombok.Data;

import java.util.List;

@Data
public class Product {
    private Integer id;                                 // 编号[主键]
    private String name;                                // 商品名
    private Integer price;                              // 价格
    private Integer stock;                              // 库存
    private Integer categoryLevel1Id;                   // 类型等级1
    private Integer categoryLevel2Id;                   // 类型等级2
    private Integer categoryLevel3Id;                   // 类型等级3
    private String fileName;                            // 图片资源文件名
    private Integer isDelete;
    private List<OrderDetail> orderDetailList;          // 商品订单信息列表
    private Integer quantity;                           // 数量
}
