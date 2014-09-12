<%-- 
    Document   : Login
    Created on : Sep 10, 2014, 5:32:36 PM
    Author     : Michael
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Please Login:</h1>
        <form action="Confirmation" method="post">
            <div>Username:</div>
            <input type="text" name="username"/><br><br>
            <div>Password:</div>
            <input type="text" name="password"><br>
            <input type="submit" value="Login">
        </form>
    </body>
</html>
