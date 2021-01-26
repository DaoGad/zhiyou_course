package com.zhiyou100.dao.impl;

import com.zhiyou100.dao.MainDao;
import com.zhiyou100.pojo.User;
import com.zhiyou100.util.DBUtil;

import java.sql.ResultSet;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;

public class MainDaoImpl implements MainDao {
    @Override
    public List<User> selectAllName(Object username) {
        String sql = "select * from t_user where u_name != ?";
        ResultSet rs = DBUtil.select(sql, username);
        List<User> list = new ArrayList<>();
        User user = null;
        try {
            while(rs.next()) {
                user = new User();
                user.setUid(rs.getInt("u_id"));
                user.setUname(rs.getString("u_name"));
                user.setUpwd(rs.getString("u_pwd"));
                list.add(user);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        DBUtil.closeAll();
        return list;
    }

    @Override
    public int addMail(int uid, int uid2, String mtheme, String mcontent, Timestamp msendtime, int msendstatus, int mreceivestatus) {
        String sql = "insert into t_mail(m_sendId,m_receiveId,m_theme,m_content,m_sendTime,m_sendStatus,m_receiveStatus) values(?,?,?,?,?,?,?)";
        int rowNUm = DBUtil.update(sql, uid, uid2, mtheme, mcontent, msendtime, msendstatus, mreceivestatus);
        return rowNUm;
    }
}
