/**
 * Copyright (C), 2020-2020, code_fusheng
 * FileName: ProductCategory
 * Author:   25610
 * Date:     2020/2/6 13:39
 * Description: 商品分类 ProductCategory 实体类
 * History:
 * <author>        <time>      <version>       <desc>
 * 作者姓名       修改时间       版本号         描述
 */
package xyz.fusheng.entity;

import lombok.Data;

import java.util.List;

@Data
public class ProductCategory {
    private Integer id;                                 // 编号主键
    private String name;                                // 商品分类名
    private Integer type;                               // 商品分类类型
    private Integer parentId;
    private List<ProductCategory> productCategories;
    private List<Product> levelOneProducts;

    public ProductCategory(Integer type, Integer parentId){
        this.type = type;
        this.parentId = parentId;
    }
    // 无参构造函数
    public ProductCategory(){
    }
}
