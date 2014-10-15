<%-- 
    Document   : SignUp
    Created on : Oct 14, 2014, 3:39:09 PM
    Author     : Michael
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="stylesheet/stylesheetOne.css" rel="stylesheet" type="text/css" />
        <title>Sign up</title>
    </head>
    <body>
        <h1>Sign Up</h1>
        <form action="Confirmation" method = "post">
        <input type="hidden" name="messageType" value="addCust">
        <p>Please enter your E-mail address: </p>
        <input type="email" name="email">
        <p>Please enter your password: </p>
        <input type="password" name="password">
        <p>Please enter your first name: </p>
        <input type="text" name="firstName">
        <p>Please enter your last name: </p>
        <input type="text" name="lastName"><br>
        <input type="submit" value="Register">
    </form>
    </body>
</html>
