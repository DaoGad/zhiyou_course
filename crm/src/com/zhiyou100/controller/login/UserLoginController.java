package com.zhiyou100.controller.login;

import com.zhiyou100.pojo.User;
import com.zhiyou100.service.UserLoginServicve;
import com.zhiyou100.service.impl.UserLoginServicveImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebServlet("/login")
public class UserLoginController extends HttpServlet {
    UserLoginServicve userLoginServicve = new UserLoginServicveImpl();

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        User user = userLoginServicve.selectByUsername(username,password);
        if(user != null){
            HttpSession session = req.getSession();
            session.setAttribute("username",username);
            session.setAttribute("uid",user.getUid());
            req.setAttribute("user",user);
            req.getRequestDispatcher("/admin.jsp").forward(req,resp);
        }else {
            req.setAttribute("msg","请输入正确的用户名密码");
            req.getRequestDispatcher("login.jsp").forward(req,resp);
        }
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }
}
