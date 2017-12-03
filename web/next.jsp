<%@ page import="com.shopping.entity.Product" %>
<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: ketan
  Date: 12/2/17
  Time: 9:40 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Products</title>
    <link rel="stylesheet" type="text/css" href="CSS/products.css">
</head>
<body>
    <%!
        List<Product> products = new ArrayList<>();
    %>
    <%
        products = (List<Product>) session.getAttribute("products");
        try {
            out.println(products.size());
        }catch (Exception e)
        {
            out.println("Exception occured");
        }
        session.removeAttribute("products");


    %>
    <form>
        <div class="product_list">
            <table>
                <thead>
                    <th>Select</th>
                    <th>ID</th>
                    <th>Name</th>
                    <th>Price</th>
                    <th>Quantity</th>
                </thead>
                <br/>
                <tbody>
                    <%
                        for (Product product: products)
                        {
                    %>
                    <tr>
                        <td><input type="checkbox" name="checkbox"/></td>
                        <td><label><%=product.getId()%></label></td>
                        <td><label><%=product.getName()%></label></td>
                        <td><label><%=product.getPrice()%></label></td>
                        <td><input class="quantityInput" type="number" min="0" name="quantity" value="<%=product.getQuantity()%>"/></td>
                    </tr>
                <%
                    }
                %>

                </tbody>

            </table>
        </div>
        <div class="buttons">
            <input type="submit" name="addToCart" value="Add to cart"/>
            <input type="submit" name="checkout" value="Checkout"/>
        </div>
    </form>

</body>
</html>
