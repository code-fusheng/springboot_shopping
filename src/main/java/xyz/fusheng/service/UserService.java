/**
 * Copyright (C), 2020-2020, code_fusheng
 * FileName: UserService
 * Author:   25610
 * Date:     2020/2/6 23:10
 * Description: 用户 User 业务接口
 * History:
 * <author>        <time>      <version>       <desc>
 * 作者姓名       修改时间       版本号         描述
 */
package xyz.fusheng.service;

import xyz.fusheng.entity.User;
import xyz.fusheng.entity.UserAddress;

import java.util.List;

public interface UserService {
    // 用户登录
    public User login(String loginName, String password);
    // 查询所有地址通过用户Id
    public List<UserAddress> findAllAddressByUserId(int id);
    // 用户注册
    public void register(User user);
}
