/**
 * Copyright (C), 2020-2020, code_fusheng
 * FileName: ProductCategoryRepository
 * Author:   25610
 * Date:     2020/2/6 21:18
 * Description: 商品分类 ProductCategory 仓库类
 * History:
 * <author>        <time>      <version>       <desc>
 * 作者姓名       修改时间       版本号         描述
 */
package xyz.fusheng.repository;

import xyz.fusheng.entity.Product;
import xyz.fusheng.entity.ProductCategory;

import java.util.List;

public interface ProductCategoryRepository {
    // 通过等级查询商品分类
    public List<ProductCategory> findProductCategoryByLevel(ProductCategory productCategory);
    // 通过等级查询所有商品
    public List<Product> findAllProductByLevel(ProductCategory productCategory);
}
