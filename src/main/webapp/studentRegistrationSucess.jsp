<%@page import="za.co.unisa.models.Student" %>
<%@ page import="java.util.List" %>
<%@page import="java.util.ArrayList" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Student Register successfully</h1>
	<table border="1">
		<thead>
			<tr>
				<th>FIRST NAME</th>
				<th>LAST NAME</th>
				<th>EMAIL</th>
				<th>PHONENUMBER</th>
				<th>DATE OF BIRTH</th>
				<th>COURSE</th>
				<th>MARITAL STATUS</th>
			</tr>
			
		</thead>
		<tbody>
			<%
			Student student = (Student) request.getAttribute("student");
			%>
			
			<tr>
				<td><%=student.getFirstName()%></td>
				<td><%=student.getLastName()%></td>
				<td><%=student.getEmail()%></td>
				<td><%=student.getPhoneNumber()%></td>
				<td><%=student.getDateOfBirth()%></td>
				<td><%=student.getCourse()%></td>
				<td><%=student.getMaritalStatus()%></td>
			</tr>
		</tbody>
	</table>
	<a href ="http://localhost:8080/MyRegisterProject/welcome.jsp"> new student list</a>
		
</body>
</html>