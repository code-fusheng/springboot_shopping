/**
 * Copyright (C), 2020-2020, code_fusheng
 * FileName: UserServiceImpl
 * Author:   25610
 * Date:     2020/2/7 9:41
 * Description: 用户 User 业务接口实现类
 * History:
 * <author>        <time>      <version>       <desc>
 * 作者姓名       修改时间       版本号         描述
 */
package xyz.fusheng.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.fusheng.entity.User;
import xyz.fusheng.entity.UserAddress;
import xyz.fusheng.repository.UserRepository;
import xyz.fusheng.service.UserService;

import java.util.List;
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public User login(String loginName, String password) {
        return userRepository.login(loginName,password);
    }

    @Override
    public List<UserAddress> findAllAddressByUserId(int id) {
        return userRepository.findAllAddressByUserId(id);
    }

    @Override
    public void register(User user) {
        userRepository.register(user);
    }
}
