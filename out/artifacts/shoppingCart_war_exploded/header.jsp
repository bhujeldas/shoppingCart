<%--
  Created by IntelliJ IDEA.
  User: ketan
  Date: 12/3/17
  Time: 6:24 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE HTML>
<html>
<head>
    <meta charset="UTF-8">
    <title>
        Responsive Header Demo
    </title>
    <link rel="stylesheet" type="text/css" href="CSS/header.css">
    <link rel="stylesheet" type="text/css" href="CSS/menu.css">
    <script src="JS/main.js"></script>
</head>
<body>
<header id="header">
    <div class="container">

        <div class="left">
            <img onclick="openmenu()" src="menu-alt-256.png" width="24px" height="24px"/>
        </div>

        <h1>
            IMCS Group shopping application
        </h1>

        <nav id='menu' class="menu">
            <ul>
                <li>
                    <a href="#">One</a>
                </li>
                <li>
                    <a href="#">Two</a>
                </li>
                <li>
                    <a href="#">Three</a>
                </li>
            </ul>
        </nav>

        <nav id="nav">
            <ul>
                <li>
                    <a href="#">Home</a>
                </li>
                <li>
                    <a href="#">About</a>
                </li>
                <li>
                    <a href="#">Services</a>
                </li>
            </ul>
        </nav>
    </div>

</header>

<%--<div class="content">
    <div class="container">
        <p>
            Lorem ipsum dolor sit amet, consectetur adipiscing
            elit, sed do eiusmod tempor incididunt ut labore et
            dolore magna aliqua. Ut enim ad minim veniam, quis
            nostrud exercitation ullamco laboris nisi ut aliquip ex
            ea commodo consequat. Duis aute irure dolor in
            reprehenderit in voluptate velit esse cillum dolore eu
            fugiat nulla pariatur. Excepteur sint occaecat
            cupidatat non proident, sunt in culpa qui officia
            deserunt mollit anim id est laborum.
        </p>
        <p>
            Nulla efficitur pharetra leo. In convallis lobortis
            nisl, ut pretium purus aliquam eget. Maecenas
            vestibulum venenatis eros, a volutpat mi malesuada eu.
            Cum sociis natoque penatibus et magnis dis parturient
            montes, nascetur ridiculus mus. Nam mollis vitae eros
            quis congue. Ut eget massa semper, cursus ligula et,
            euismod lacus. Sed neque metus, tristique eget
            scelerisque vitae, luctus at metus. Proin vel
            ullamcorper arcu. Praesent dapibus eleifend turpis et
            euismod. Sed tincidunt lobortis erat, nec elementum
            libero molestie sed. Phasellus eget tristique lorem.
        </p>
        <p>
            Maecenas dictum molestie nisi, eu ornare mauris posuere
            a. Proin tempus est ligula, ut varius risus faucibus
            nec. Morbi ultrices leo et vulputate facilisis. Nunc
            congue, leo a facilisis dictum, metus neque tempus
            arcu, ac aliquet nulla mi a felis. Maecenas quis
            euismod velit. Curabitur dapibus ipsum vitae
            ullamcorper auctor. Nullam nec ultricies urna.
            Curabitur lacinia nec ipsum a condimentum. Quisque
            lacinia faucibus augue, sed efficitur enim mollis eget.
            In et metus non ante interdum varius nec in sem.
        </p>
    </div>
</div>--%>
</body>
</html>
