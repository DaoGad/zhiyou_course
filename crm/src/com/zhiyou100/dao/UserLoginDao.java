package com.zhiyou100.dao;

import com.zhiyou100.pojo.User;

public interface UserLoginDao {
    User selectByUsername(String username, String password);
}
