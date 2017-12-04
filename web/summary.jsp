<%--
  Created by IntelliJ IDEA.
  User: ketan
  Date: 12/3/17
  Time: 2:35 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Cart</title>
    <link rel="stylesheet" type="text/css" href="CSS/cart.css">
</head>
<body>
    <div>
        <jsp:include page="header.jsp" />
    </div>
    <div class="content">
        <div class="container">
    <h1>
        Summary of Cart
    </h1>
    <form name="cart" action="/checkout" method="post">
        <div class="cartProducts">
            <table>
                <thead>
                    <th>Product</th>
                    <th>Quantity</th>
                    <th>Cost</th>
                </thead>
                <tbody>

                    <tr>
                        <td> Lamp </td>
                        <td> 2 </td>
                        <td> 20 </td>
                    </tr>

                    <tr>
                        <td>
                            Total
                        </td>
                        <td>
                            <label></label>
                        </td>
                        <td>
                            $13
                        </td>
                    </tr>

                </tbody>
            </table>
        </div>

        <div class="buttons">
            <input type="submit" name="BackToCart" value="Back to Cart"/>
            <input type="submit" name="Checkout" value="Checkout"/>
        </div>
    </form>
        </div>
    </div>
    <div>
        <jsp:include page="footer.jsp" />
    </div>
</body>
</html>
