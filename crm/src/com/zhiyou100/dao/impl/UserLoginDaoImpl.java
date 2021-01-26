package com.zhiyou100.dao.impl;

import com.zhiyou100.dao.UserLoginDao;
import com.zhiyou100.pojo.User;
import com.zhiyou100.util.DBUtil;

import java.sql.ResultSet;

public class UserLoginDaoImpl implements UserLoginDao {
    @Override
    public User selectByUsername(String username, String password) {
        String sql = "select * from t_user where u_name = ? and u_pwd = ?";
        ResultSet rs = DBUtil.select(sql, username, password);
        User user = null;
        try {
            while(rs.next()) {
                user = new User();
                user.setUid(rs.getInt("u_id"));
                user.setUname(rs.getString("u_name"));
                user.setUpwd(rs.getString("u_pwd"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        DBUtil.closeAll();
        return user;
    }
}
