<%-- 
    Document   : profile
    Created on : Apr 14, 2022, 1:26:41 PM
    Author     : Collin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ include file="ApplicationHeader.jsp" %>  
<% 
    String SessionID = session.getId();
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Profile</title>
    </head>
    <body>
        <h1>Profile</h1>
        <p>Welcome ${message}!</p>
    </body>
</html>
