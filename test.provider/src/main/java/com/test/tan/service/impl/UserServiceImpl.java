package com.test.tan.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.test.tan.dao.UserMapper;
import com.test.tan.model.User;
import com.test.tan.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @author tanbb
 * @create 2022-02-15
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
