package com.cn.shop.dao;

import com.cn.shop.entity.Address;

import java.util.List;

public interface AddressMapper {
    int deleteByPrimaryKey(Integer aid);

    int insert(Address record);

    int insertSelective(Address record);

    Address selectByPrimaryKey(Integer aid);

    int updateByPrimaryKeySelective(Address record);

    int updateByPrimaryKey(Address record);

    List<Address> findAllAddressesById(Integer id);
}