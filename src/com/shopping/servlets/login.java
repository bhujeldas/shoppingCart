package com.shopping.servlets;

import com.shopping.entity.Product;

import javax.jms.Session;
import javax.servlet.*;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;


public class login extends HttpServlet{

    public login() {
        super();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("Yes connecting");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        String username = req.getParameter("username");
        String password = req.getParameter("password");
        System.out.println(username);
        HttpSession session = req.getSession(true);
        //RequestDispatcher rd = req.getRequestDispatcher("/next.jsp");
        //rd.forward(req,resp);
        List<Product> productList = new ArrayList<>();
        for(int i=0;i<10;i++)
        {
            productList.add(new Product(i,"some",(float) 10,2));
        }
        //RequestDispatcher rd = req.getRequestDispatcher("/next.jsp");
        session.setAttribute("products",productList);
        //rd.forward(req,resp);
        resp.sendRedirect("/next.jsp");
    }
}
