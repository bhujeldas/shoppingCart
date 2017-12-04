
package com.shopping.servlets;

import com.shopping.entity.Product;
import com.shopping.services.LoginService;
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
    private LoginService loginService;
    private HttpSession session;
    @Override
    public void init() throws ServletException {
        loginService=new LoginService();
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request,response);
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String nextPage = "/index.jsp";
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        boolean isValidUser = loginService.authenticate(username, password);
        if (isValidUser) {
            nextPage = "/cart.jsp";
            List<Product> productList = new ArrayList<>();
            for (int i = 0; i < 5; i++) {
                productList.add(new Product(i, "some", (float) 10, 2));
            }
            session = request.getSession(true);
            session.setAttribute("products", productList);
        } else {
            nextPage = "/index.jsp";
            request.setAttribute("invalidUser", "Warning: Invalid username or password!");
        }
        RequestDispatcher rd = request.getRequestDispatcher(nextPage);
        rd.forward(request, response);
    }
}
