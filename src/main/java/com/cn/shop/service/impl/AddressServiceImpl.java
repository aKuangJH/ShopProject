package com.cn.shop.service.impl;

import com.cn.shop.dao.AddressMapper;
import com.cn.shop.entity.Address;
import com.cn.shop.service.AddressService;
import com.cn.shop.utils.ReturnHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class AddressServiceImpl implements AddressService{

    @Autowired
    AddressMapper addressDao;

    @Override
    public Map<String, Object> getAllAddresses(Integer id) throws Exception {
        Map<String, Object> map;
        List<Address> existaddresses = addressDao.findAllAddressesById(id);
        System.out.println("所有地址数:"+existaddresses.size());
        if (!existaddresses.isEmpty()) {
            map = ReturnHelper.success("success");
            map.put("addresses", existaddresses);
        } else {
            map = ReturnHelper.fail("fail");
            map.put("addresses", null);
        }
        return map;
    }

    @Override
    public Map<String, Object> addAddress(Address address) throws Exception {
        Map<String, Object> map;
        Integer result = addressDao.insert(address);
        if(result>0){
            map = ReturnHelper.success("success");
        }else{
            map = ReturnHelper.fail("fail");
        };
        return map;
    }


}
