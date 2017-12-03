<%--
  Created by IntelliJ IDEA.
  User: ketan
  Date: 12/2/17
  Time: 8:47 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Welcome</title>
      <link rel="stylesheet" type="text/css" href="CSS/style.css">
  </head>
  <body>

  <form name="something" action="/login" method="post">
      <span class="message"> </span>
      <div class="logininput">
          Username: <input type="text" name="username" value=""/>
          <br/>
          Password: <input type="password" name="password" value=""/>
      </div>

    <div class="loginbuttons">
      <input type="submit" name="page" value="Login"/>
      <input type="reset" name="page" value="Reset"/>
    </div>

  </form>

  </body>
</html>
