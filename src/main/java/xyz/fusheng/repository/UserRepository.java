/**
 * Copyright (C), 2020-2020, code_fusheng
 * FileName: UserRepository
 * Author:   25610
 * Date:     2020/2/6 15:25
 * Description: 用户 User 仓库类
 * History:
 * <author>        <time>      <version>       <desc>
 * 作者姓名       修改时间       版本号         描述
 */
package xyz.fusheng.repository;

import xyz.fusheng.entity.User;
import xyz.fusheng.entity.UserAddress;

import java.util.List;

public interface UserRepository {
    // 用户登录
    public User login(String loginName, String password);
    // 查询所有地址通过用户Id
    public List<UserAddress> findAllAddressByUserId(int id);
    // 用户注册
    public void register(User user);
}
