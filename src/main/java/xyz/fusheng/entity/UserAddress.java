/**
 * Copyright (C), 2020-2020, code_fusheng
 * FileName: UserAddress
 * Author:   25610
 * Date:     2020/2/6 13:40
 * Description: 用户地址 UserAdress 实体类
 * History:
 * <author>        <time>      <version>       <desc>
 * 作者姓名       修改时间       版本号         描述
 */
package xyz.fusheng.entity;

import lombok.Data;

import java.util.Date;

@Data
public class UserAddress {
    private Integer id;
    private Integer userId;                                 // 用户Id
    private String address;                                 // 用户地址
    private Date createTime;                                // 创建时间
    private Integer isDefault;                              // 是否为 Default
    private String remark;                                  // 标记选中
}
