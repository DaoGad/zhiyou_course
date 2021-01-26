package com.zhiyou100.file.controller;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/user/upload")
public class UploadFileServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doPost(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        resp.setContentType("text/html;charset=UTF-8");
        String username = req.getParameter("username");
        boolean isMultipart = ServletFileUpload.isMultipartContent(req);
        if(!isMultipart){
            return;
        }else {
            try {
                DiskFileItemFactory factory = new DiskFileItemFactory();
                ServletFileUpload upload = new ServletFileUpload(factory);
                upload.setFileSizeMax(1024 * 1024 * 5);
                upload.setSizeMax(1024 * 1024 * 100);
                List<FileItem> items = upload.parseRequest(req);
                for (FileItem item : items) {
                    if (!item.isFormField()){
//                        String fieldName = item.getFieldName(); //
                        String name = item.getName();
                    }
                }
            } catch (FileUploadException e) {
                e.printStackTrace();
            }
        }
    }
}
