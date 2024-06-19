<%-- 
    Document   : Application
    Created on : Feb 22, 2022, 10:52:35 AM
    Author     : admin
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
        <title>My Application</title>
    </head>
    <body>
        <h1>Welcome ${message} to the Application</h1>
    </body>
</html>
