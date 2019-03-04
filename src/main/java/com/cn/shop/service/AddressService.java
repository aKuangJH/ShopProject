package com.cn.shop.service;

import com.cn.shop.entity.Address;

import java.util.Map;

public interface AddressService {
    public Map<String, Object> getAllAddresses(Integer id)throws Exception;

    public Map<String, Object> addAddress(Address address)throws Exception;
}
