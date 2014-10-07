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
    
    <div>Total Called Customers: ${totalCust}</div>
    
    <form action="Confirmation" method="post">
        <input type="hidden" name="messageType" value="nextCust">
        <input type="submit" value="Next Client">
    </form>
    
    <footer>
        <p>Team ProjectX</p>
    </footer>
    
</html>
