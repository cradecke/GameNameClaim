<%-- 
    Document   : usersearch
    Created on : Apr 14, 2022, 1:27:08 PM
    Author     : Collin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ include file="Header.jsp" %>  
<% 
    String SessionID = session.getId();
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Search</title>
    </head>
    <body>
         <main class="form-signin">
        <form action="ProfileServlet" method="post">
          <h1 class="h3 mb-3 fw-normal">Search for a gamer name</h1>

          
          <div class="form-floating">
              
            <input type="text" class="form-control" id="floatingInput" placeholder="Screenname" name="sname">
            <label for="floatingInput">Screenname</label>
          </div>

          <button class="w-100 btn btn-lg btn-primary" type="submit">Search</button>
          
          <p> <div>${message}</div>
          <div>${sname}</div>
          <div>${platforms}</div></p>
          
          <p class="mt-5 mb-3 text-muted">&copy; 2017–2021</p>
        </form>
  </main>
    </body>
</html>
