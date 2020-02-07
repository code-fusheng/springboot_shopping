/**
 * Copyright (C), 2020-2020, code_fusheng
 * FileName: CartServiceImpl
 * Author:   25610
 * Date:     2020/2/6 23:22
 * Description: 购物车 Cart 业务接口实现类
 * History:
 * <author>        <time>      <version>       <desc>
 * 作者姓名       修改时间       版本号         描述
 */
package xyz.fusheng.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.fusheng.entity.Cart;
import xyz.fusheng.repository.CartRepository;
import xyz.fusheng.service.CartService;

import java.util.List;
@Service
public class CartServiceImpl implements CartService {

    @Autowired
    private CartRepository cartRepository;

    @Override
    public void save(Cart cart) {
        cartRepository.save(cart);
    }

    @Override
    public List<Cart> findAllByUserId(int id) {
        return cartRepository.findAllByUserId(id);
    }

    @Override
    public void deleteById(int id) {
        cartRepository.deleteById(id);
    }

    @Override
    public void update(int id, int quantity, int cost) {
        Cart cart = new Cart();
        cart.setId(id);
        cart.setQuantity(quantity);
        cart.setCost(cost);
        cartRepository.update(cart);
    }
}
