/**
 * Copyright (C), 2020-2020, code_fusheng
 * FileName: ProductService
 * Author:   25610
 * Date:     2020/2/6 23:06
 * Description: 商品 Prodcut 业务接口
 * History:
 * <author>        <time>      <version>       <desc>
 * 作者姓名       修改时间       版本号         描述
 */
package xyz.fusheng.service;

import xyz.fusheng.entity.Product;
import xyz.fusheng.entity.ProductCategory;

import java.util.List;

public interface ProductService {
    public List<ProductCategory> findAllProductCategory();
    public List<Product> findAllProductByLevel(ProductCategory productCategory);
    public Product findById(int id);
    public List<Product> findAllByKeyWord(String keyWord);
}
