package com.cn.shop.controller;


import com.cn.shop.entity.Address;
import com.cn.shop.service.AddressService;
import com.cn.shop.utils.CookieHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.Cookie;
import java.util.HashMap;
import java.util.Map;

@RequestMapping(value = "address", method = {RequestMethod.GET,RequestMethod.POST})
@Controller
public class AddressController {

    @Autowired
    AddressService addressService;

    @RequestMapping(value = "addaddress")
    @ResponseBody
    public Map<String, Object> addAddress(@RequestParam("address") String address, @RequestParam("getpelname") String getpelname, @RequestParam("getpelnum") String getpelnum, @RequestParam("code") int code) throws Exception {
        Map<String, Object> map = new HashMap<String, Object>();
        String newaddress = new String(address.getBytes("ISO8859-1"), "utf-8");
        String name = new String(getpelname.getBytes("ISO8859-1"), "utf-8");
        System.out.println("修改以后"+newaddress);

        CookieHelper cookieHelper = new CookieHelper();
        int uid = Integer.parseInt(cookieHelper.getCookieValue("uid"));
        Address add = new Address();
        add.setAddress(newaddress);
        add.setGetpelname(name);
        add.setGetpelnum(getpelnum);
        add.setGetpelcode(code);
        add.setUid(uid);
        return addressService.addAddress(add);
    }


    @RequestMapping(value = "getaddresses")
    @ResponseBody
    public Map<String, Object> getAddresses(@RequestParam("id") Integer id) throws Exception {
        System.out.println("hjhjhjhjhj");
        return addressService.getAllAddresses(id);
    }




    @RequestMapping(value = "test")
    @ResponseBody
    public String llala() throws Exception {
        System.out.println("hjhjhjhjhj");
        return "hahah";
    }



}
