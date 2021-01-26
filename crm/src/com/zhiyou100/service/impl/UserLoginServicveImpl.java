package com.zhiyou100.service.impl;

import com.zhiyou100.dao.UserLoginDao;
import com.zhiyou100.dao.impl.UserLoginDaoImpl;
import com.zhiyou100.pojo.User;
import com.zhiyou100.service.UserLoginServicve;

public class UserLoginServicveImpl implements UserLoginServicve {
    UserLoginDao userLoginDao = new UserLoginDaoImpl();

    @Override
    public User selectByUsername(String username, String password) {
        return userLoginDao.selectByUsername(username,password);
    }
}
