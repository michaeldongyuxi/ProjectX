<%-- 
    Document   : index
    Created on : Sep 9, 2014, 4:21:32 PM
    Author     : Michael
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="stylesheet/stylesheetOne.css" rel="stylesheet" type="text/css" />
        <title>Test Project</title>
    </head>
    
    <header>
    <jsp:include page="header.jsp" />
    
    </header>
    
    <a href="Login.jsp" name="Login" class="login">Login</a>
    <a href="SignUp.jsp" name="Sign up" class="SignUp">Sign up</a>
    
    <body>
        
        <h1 class="title">Welcome to Online Waiting System</h1>
        
        <h2>Please enter your information</h2>
        
        <form action="Confirmation" method="post" class="formOne">
            <input type="hidden" name="messageType" value="submitInfo">
            <div>Please enter your email:</div>
            <input name="email" type="email" required><br><br>
            <div>Please enter your name:</div>
            <input name="name" type="text" required><br><br>
            <div>How many people are coming?</div>
            <input name="people" type="text" required><br><br>
            <input type="submit">
        </form><br>

    
        <img src="<c:url value="/images/DSC_5750.JPG" />" alt="dinosaur" hight="200" height="200">
        <section>I have no idea what this dinosaur's doing here either.</section>
        <br><br><br><br><br><br><br><br><br><br><br>
        
        <p>Team ProjectX</p>
        
    </body>
</html>