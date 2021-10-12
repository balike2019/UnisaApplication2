<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>unisa login</title>
</head>
<body>
<%String  error=(String)request.getAttribute("error") ;
if(error==null)
	error = "";
else
	error=(String)request.getAttribute("errror");

%>
<form action="staffLogin"  method="post">

<table style="background-color:skyblue;margin-left:20px;margin-left:20px;">
   <tr>
   <td><h3 style="color:red;">${message}</h3>
   <h3 style="color:green,">${successMessage}</h3>
   <td></td>
   </tr>
   <tr>
   <td><h3 style="color:red;"> Login page!!! </h3></td>
   <td></td>
   </tr>
	<tr><td>UserName:</td><td><input type="text" name="username"></td></tr>
	
	<tr><td>password:</td><td><input type="password" name="password"></td></tr>
	
<tr><td><input type="submit" name ="Login" value="Login"></td>
   <td><a href ="http://localhost:8080/MyRegisterProject/registerStaff.jsp">create new account</a></td></tr>					
</table>
<% if(error==null)error = "";%>
<%if( error!=null)error=(String)request.getAttribute("error"); 
out.println("<font color=red size=4px>"+error+"</font>");
%>
	
</form>
      
</body>
</html>