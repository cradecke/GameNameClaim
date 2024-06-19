<%-- 
    Document   : login.jsp
    Created on : Mar 15, 2022, 10:17:06 AM
    Author     : admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ include file="Header.jsp" %>  
<!DOCTYPE html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
     <style>
      .bd-placeholder-img {
        font-size: 1.125rem;
        text-anchor: middle;
        -webkit-user-select: none;
        -moz-user-select: none;
        user-select: none;
      }

      @media (min-width: 768px) {
        .bd-placeholder-img-lg {
          font-size: 3.5rem;
        }
      }
    </style>

    
    <!-- Custom styles for this template -->
    <link href="css/signin.css" rel="stylesheet">
    <title>Sign in</title>
</head>
<body>
    
    <main class="form-signin">
        <form action="LoginServlet" method="post">
          
          <h1 class="h3 mb-3 fw-normal">Please sign in</h1>
          
          <div>${message}</div>

          <div class="form-floating">
            <input type="text" class="form-control" id="floatingInput" placeholder="name@example.com" name="sname">
            <label for="floatingInput">Screen name</label>
          </div>
          <div class="form-floating">
            <input type="password" class="form-control" id="floatingPassword" placeholder="Password" name="pwd">
            <label for="floatingPassword">Password</label>
          </div>

          <div class="checkbox mb-3">
            
          </div>
          <button class="w-100 btn btn-lg btn-primary" type="submit">Sign in</button>
          
          <br><!-- comment -->
          <p class="mt-5 mb-3 text-muted">&copy; 2017–2021</p>
        </form>
  </main>
   
</body>
</html>
