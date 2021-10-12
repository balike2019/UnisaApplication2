<%@ page import = "za.co.unisa.models.Staff" %>
<%@page import="za.co.unisa.models.User" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>sucess</title>
</head>
<body>
<h2>Congratulations your information has been process</h2>
<br>
<br>
<% Staff staff =(Staff) request.getAttribute("staff");
User user=(User) request.getAttribute("user");
StringBuilder makpass=new StringBuilder("**************");
makpass.setLength(user.getPassword().length());
%>
FIRSTNAME :<%=staff.getFirstName() %><br>
LASTNAME:<%=staff.getLastName() %><br>
EMAIL  :<%=staff.getEmail() %><br>
PHONENUMBER :<%=staff.getPhoneNumber() %><br>
USERNAME:<%=user.getUsername() %><br>
PASSWORD:<%=user.getPassword() %><br>

<h3>Thanks you </h3>
<a href ="http://localhost:8080/MyRegisterProject/login.jsp">go to login page!</a>
<br><br>
</body>
</html>