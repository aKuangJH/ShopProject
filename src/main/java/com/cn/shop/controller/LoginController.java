package com.cn.shop.controller;
import com.cn.shop.entity.User;
import com.cn.shop.service.LoginService;
import com.cn.shop.utils.ReturnHelper;
import org.apache.commons.lang.StringUtils;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.HashMap;
import java.util.Map;

/**
 * @Description TODO
 * @Author aKuang
 * @@Date 2019/1/2311:50
 **/
@RequestMapping(value = "login", method = {RequestMethod.GET,RequestMethod.POST})
@Controller
public class LoginController {

    @Autowired
    private LoginService loginService;

    @RequestMapping(value = "getpublickey")
    @ResponseBody
    public ModelAndView getPunlicKey(Model model){
        ModelAndView mav = new ModelAndView();
        mav.setViewName("success");
        return mav;
    }


    @RequestMapping(value = "verification")
    @ResponseBody
    public Map<String, Object> userLogin(@RequestParam(value = "username") String username, @RequestParam(value = "password") String password){
        System.out.println("ysername:"+username);
        Map<String, Object> map = new HashMap<String, Object>();
        if(StringUtils.isNotBlank("username") && StringUtils.isNotBlank("password")){
            User user = loginService.userLogin(username, password);
            if(null != user){
                System.out.println("success!");
                map = ReturnHelper.success("登陆成功");
                map.put("user", user);

            }else {
                map = ReturnHelper.fail("登录失败");
                map.put("user", null);
            }
        }


        for (String key : map.keySet())
        {
            Object value = map.get(key);
            System.out.println("Key = " + key + ", Value = " + value.toString());
        }
        return map;
    }




}
