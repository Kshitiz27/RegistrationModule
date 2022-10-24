<%@page import="com.registrationmodule.entity.student"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <% student user =(student) session.getAttribute("currentuser"); 
    
    if(user==null){
    	response.sendRedirect("Login.jsp");
    }
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Profile</title>
    <link href="css_files/reg.css" rel="stylesheet">
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
</head>
<body>

<img id="login" alt="profile.jpg" src="images/profile.jpg" style="padding-top: 100px; padding-left: 350px">

 <div class="pt-1 mb-4">
                  <a href="Logout" style="margin-left: 580px; margin-top: -90px"  class="btn btn-dark btn-lg btn-block">Logout</a>
  </div>

</body>
</html>