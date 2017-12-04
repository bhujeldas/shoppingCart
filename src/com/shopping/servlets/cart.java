package com.shopping.servlets;

import com.shopping.entity.Product;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class cart extends HttpServlet {
    public cart() {
        super();
    }
    public int count;
    HttpSession cartSession;
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        super.doGet(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String[] selectedProductIds = request.getParameterValues("chkProducts");
        if (selectedProductIds != null && count > 0) {
            cartSession.removeAttribute("cart");
            count = selectedProductIds.length;
            System.out.println(count);
            if (request.getParameter("addToCart") != null) {
                List<Product> cartList = new ArrayList<>();
                Product product;
                for (String selectedProductId : selectedProductIds) {
                    Integer id = Integer.parseInt(selectedProductId);
                    Integer quantity = Integer.parseInt(request.getParameter("qty" + selectedProductId));
                    String name = "laptop";
                    Float price = 10.0f;
                    product = new Product(id, name, price, quantity);
                    cartList.add(product);
                }
                request.setAttribute("addToCartMessage", cartList.size() + " product(s) added to cart sucessfully.");
                response.sendRedirect("/cart.jsp");
            } else if (request.getParameter("checkout") != null) {
                response.sendRedirect("/summary.jsp");
            }
        }else{
            request.setAttribute("addToCartMessage", "Product not selected.");
        }
    }
}
