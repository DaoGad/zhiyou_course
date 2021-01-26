package com.zhiyou100.dao;

import com.zhiyou100.pojo.User;

import java.sql.Timestamp;
import java.util.List;

public interface MainDao {
    List<User> selectAllName(Object username);

    int addMail(int uid, int uid2, String mtheme, String mcontent, Timestamp msendtime, int msendstatus, int mreceivestatus);
}
