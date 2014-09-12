<%-- 
    Document   : Confirmation
    Created on : Sep 9, 2014, 4:29:27 PM
    Author     : Michael
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="stylesheet/stylesheetOne.css" rel="stylesheet" type="text/css" />
        <title>Confirmation</title>
    </head>
    <body>
        <h1>Please Confirm Your Info</h1>
        <div>Name: ${name}</div><br>
        <div>Email: ${email}</div><br>
        <div>People are coming: ${people}</div><br><br>
        
        <form action="Confirmation" method="post">
            <input type="hidden" name="messageType" value="confirm">
            <input type="submit" value="confirm">
        </form>
    </body>
</html>
