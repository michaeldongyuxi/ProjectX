<%-- 
    Document   : RestaurantWelcome
    Created on : Oct 15, 2014, 3:05:11 PM
    Author     : Michael
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="stylesheet/stylesheetOne.css" rel="stylesheet" type="text/css" />
        <title>JSP Page</title>
    </head>
    <body>
        <h1>RESTAURANT WELCOME</h1>
        <form action="Confirmation" method = "post">
            <input type="hidden" name="messageType" value="logOut">
            <input type="submit" value="Log out">
        </form>
    </body>
</html>
