package com.shopping.servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class cart extends HttpServlet {
    public cart() {
        super();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.doGet(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //super.doPost(req, resp);
        String checkbox = req.getParameter("checkbox"+0);
        System.out.println("This is working");
        System.out.println("This is working"+checkbox);
        resp.sendRedirect("/cart.jsp");
    }
}
