package com.moon.service;

import com.moon.entity.User;
import com.moon.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


/**
 * @author: faker
 * @Date:2019/1/4
 */

@Service
public class UserServer {

    @Autowired
    private UserMapper userMapper;

    @Transactional
    public User userInfo(String userName) {
        return userMapper.findAllByUserName(userName);
    }

}
