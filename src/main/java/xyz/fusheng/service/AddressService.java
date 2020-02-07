/**
 * Copyright (C), 2020-2020, code_fusheng
 * FileName: AddressService
 * Author:   25610
 * Date:     2020/2/6 22:30
 * Description: 地址 Address 业务接口
 * History:
 * <author>        <time>      <version>       <desc>
 * 作者姓名       修改时间       版本号         描述
 */
package xyz.fusheng.service;

import xyz.fusheng.entity.UserAddress;

import java.util.List;

public interface AddressService {
    // 保存用户地址
    public void save(UserAddress userAddress);
    // 通过用户Id查询所有地址
    public List<UserAddress> findAllByUserId(int id);
}
