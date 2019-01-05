package com.moon.controller;


import com.moon.service.UserServer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author: faker
 * @Date:2019/1/4
 */
@RestController
public class UserLogin {

    public final static Logger logger = LoggerFactory.getLogger(UserLogin.class);

    @Autowired
    private UserServer userServer;

    /**
     * @param param 登录账号和密码;
     */
    @RequestMapping(value = "/userlogin", method = RequestMethod.GET)
    public List<Object> User(@RequestBody Map<String, Object> param) {
        List<Object> userInfo = new ArrayList<Object>();
        userInfo.add(userServer.userInfo(param.get("userName").toString()));
        logger.info(userInfo.toString());
        return userInfo;
    }
}
