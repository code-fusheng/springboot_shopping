/**
 * Copyright (C), 2020-2020, code_fusheng
 * FileName: User
 * Author:   25610
 * Date:     2020/2/6 13:23
 * Description: 用户 User 实体类
 * History:
 * <author>        <time>      <version>       <desc>
 * code_fusheng                   1.0
 */
package xyz.fusheng.entity;

import lombok.Data;

import java.util.List;

@Data
public class User {
    private Integer id;                     // 编号
    private String loginName;               // 登录名
    private String username;                // 用户名
    private String password;                // 登陆密码
    private Integer sex;                    // 性别
    private String identityCode;            // 身份号码
    private String email;                   // 邮箱
    private String mobile;                  // 手机号
    private Integer type;                   // 系统权限
    private String fileName;                // 头像文件名
    private List<Order> order;              // 用户订单列表
    private List<UserAddress> userAddress;  // 用户地址列表
    private List<Cart> carts;               // 用户购物车

}
