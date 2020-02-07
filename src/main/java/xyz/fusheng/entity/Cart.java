/**
 * Copyright (C), 2020-2020, code_fusheng
 * FileName: Cart
 * Author:   25610
 * Date:     2020/2/6 13:35
 * Description: 购物车 Cart 实体类
 * History:
 * <author>        <time>      <version>       <desc>
 * 作者姓名       修改时间       版本号         描述
 */
package xyz.fusheng.entity;

import lombok.Data;

@Data
public class Cart {
    private Integer id;
    private Product product;                    // 购物车里的商品
    private Integer quantity;                   // 数量
    private Integer cost;                       // 费用
    private User user;                          // 购物车用户
}

