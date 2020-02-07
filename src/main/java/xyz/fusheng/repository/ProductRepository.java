/**
 * Copyright (C), 2020-2020, code_fusheng
 * FileName: ProductRepository
 * Author:   25610
 * Date:     2020/2/6 21:30
 * Description: 商品 Product 仓库类
 * History:
 * <author>        <time>      <version>       <desc>
 * 作者姓名       修改时间       版本号         描述
 */
package xyz.fusheng.repository;

import xyz.fusheng.entity.Product;

import java.util.List;

public interface ProductRepository {
    // 通过id查询商品
    public Product findById(int id);
    // 查询所有商品通过关键字
    public List<Product> findAllByKeyWord(String keyword);
}
