package com.zhiyou100.service.impl;

import com.zhiyou100.dao.MainDao;
import com.zhiyou100.dao.impl.MainDaoImpl;
import com.zhiyou100.pojo.User;
import com.zhiyou100.service.MailService;

import java.sql.Timestamp;
import java.util.List;

public class MailServiceImpl implements MailService {
    MainDao mainDao = new MainDaoImpl();

    @Override
    public List<User> selectAllName(Object username) {
        return mainDao.selectAllName(username);
    }

    @Override
    public int addMail(int uid, int uid2, String mtheme, String mcontent, Timestamp msendtime, int msendstatus, int mreceivestatus) {
        return mainDao.addMail(uid,uid2,mtheme,mcontent,msendtime,msendstatus,mreceivestatus);
    }
}
