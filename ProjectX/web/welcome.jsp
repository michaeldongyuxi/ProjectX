<%-- 
    Document   : welcome
    Created on : Sep 12, 2014, 4:36:25 PM
    Author     : Michael
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    
    <style>
        body{
            background-color: rgba(255,255,0,0.5);
            text-align: center;
        }
        
        footer{
            background-color: rgba(255,255,255,0.5);
            width: 100px;
            height: 100px;
            text-align: center;
            margin: 0 auto;
        }
    </style>
    
    <body>
        <h1>Welcome, Team ProjectX</h1>
    </body>
    
    <form action="Confirmation" method="post">
        <input type="hidden" name="messageType" value="nextCust">
        <input type="submit" value="Next Customer">
    </form>
    
    <form action="Confirmation" method = "post">
        <input type="hidden" name="messageType" value="addCust">
        <p>Please enter your username: </p>
        <input type="text" name="user">
        <p>Please enter your password: </p>
        <input type="password" name="password">
        <p>Please enter your first name: </p>
        <input type="text" name="firstName">
        <p>Please enter your last name: </p>
        <input type="text" name="lastName">
        <p>Please enter your E-mail address: </p>
        <input type="email" name="email"><br>
        <input type="submit" value="Register">
    </form>
    
    <div>Total Called Customers: ${totalCust}</div>
    
    <footer>
        <p>Team ProjectX</p>
    </footer>
    
</html>
