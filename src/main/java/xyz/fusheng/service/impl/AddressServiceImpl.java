/**
 * Copyright (C), 2020-2020, code_fusheng
 * FileName: AddressServiceImpl
 * Author:   25610
 * Date:     2020/2/6 23:15
 * Description: 地址 Address 业务接口实现类
 * History:
 * <author>        <time>      <version>       <desc>
 * 作者姓名       修改时间       版本号         描述
 */
package xyz.fusheng.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import xyz.fusheng.entity.UserAddress;
import xyz.fusheng.repository.AddressRepository;
import xyz.fusheng.service.AddressService;

import java.util.List;
@Service
public class AddressServiceImpl implements AddressService {
    // 自动注入 AddressRepository 仓库
    @Autowired
    private AddressRepository addressRepository;

    @Override
    public void save(UserAddress userAddress) {
        addressRepository.save(userAddress);
    }

    @Override
    public List<UserAddress> findAllByUserId(int id) {
        return addressRepository.findAllByUserId(id);
    }
}
