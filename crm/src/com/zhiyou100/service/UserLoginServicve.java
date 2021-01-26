package com.zhiyou100.service;

import com.zhiyou100.pojo.User;

public interface UserLoginServicve {
    User selectByUsername(String username, String password);
}
