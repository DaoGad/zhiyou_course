package com.zhiyou100.controller.main;

import com.zhiyou100.pojo.User;
import com.zhiyou100.service.MailService;
import com.zhiyou100.service.impl.MailServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@WebServlet("/mail/write")
public class MailWriteController extends HttpServlet {
    MailService mailService = new MailServiceImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Object username = req.getSession().getAttribute("username");
        List<User> list = mailService.selectAllName(username);
        System.out.println("list-------------"+list);
        req.setAttribute("list",list);
        req.getRequestDispatcher("/WEB-INF/view/write.jsp").forward(req,resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        int uid = (int) req.getSession().getAttribute("uid");
        String uidstr = req.getParameter("uname");
        System.out.println("uid2 -----------"+uidstr);
        int uid2 = Integer.parseInt(uidstr);
        System.out.println("-------------"+uid2);
        String mtheme = req.getParameter("mtheme");
        String mcontent = req.getParameter("mcontent");
        String msendtimeStr = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
        Timestamp msendtime = Timestamp.valueOf(msendtimeStr);
        int msendstatus;
        int mreceivestatus;
        String hidden = req.getParameter("hidden");
        if("1".equals(hidden)){
            //发送
            msendstatus = 2;
            mreceivestatus = 1;
            int rowNum = mailService.addMail(uid,uid2,mtheme,mcontent,msendtime,msendstatus,mreceivestatus);
            if(rowNum > 0){
                //写完去发件箱
                req.getRequestDispatcher("/WEB-INF/view/send.jsp").forward(req,resp);
            }
        }else {
            msendstatus = 1;
            mreceivestatus = 1;
            int rowNum = mailService.addMail(uid,uid2,mtheme,mcontent,msendtime,msendstatus,mreceivestatus);
            //去 草稿箱
            if(rowNum > 0){
                req.getRequestDispatcher("/WEB-INF/view/draft.jsp").forward(req,resp);
            }
        }
    }
}
