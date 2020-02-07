/**
 * Copyright (C), 2020-2020, code_fusheng
 * FileName: CartService
 * Author:   25610
 * Date:     2020/2/6 22:51
 * Description: 购物车 Cart 服务接口
 * History:
 * <author>        <time>      <version>       <desc>
 * 作者姓名       修改时间       版本号         描述
 */
package xyz.fusheng.service;

import xyz.fusheng.entity.Cart;

import java.util.List;

public interface CartService {
    // 保存购物车
    public void save(Cart cart);
    // 查询所有购物车列表通过用户Id
    public List<Cart> findAllByUserId(int id);
    // 通过Id删除
    public void deleteById(int id);
    // 更新购物车
    public void update(int id, int quantity, int cost);
}
