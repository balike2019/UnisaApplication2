<%@ page import="java.util.List"%>
<%@ page import="java.util.ArrayList"%>
<%@ page import="za.co.unisa.models.Student"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>WELCOME TO UNISA</h1>
	
	<%
	String result = (String) request.getAttribute("result");
	%>
	

	<form action="search" method="Get">
		<input type="text" name="searchBox" required="required">
		<select name="identifier">
			<option value="">options</option>
			<option value="first_name">First name</option>
			<option value="last_name">last name</option>
			<option value="email">email</option>
			<option value="phone_number">phone number</option>
			
		</select> 
		<input type="submit" value="search">
	</form>
	<a href="http://localhost:8080/MyRegisterProject/addStudent.jsp">create student!</a><br>

	<%=result%>

	<div align="center">
		<table border="1">
			<caption>Existing Student</caption>
			<tr>
				<th>FIRST NAME</th>
				<th>LAST NAME</th>
				<th>EMAIL</th>
				<th>Phone Number</th>
				<th>Date Of Birth</th>
				<th>Course</th>
				<th>MaritalStatus</th>
			</tr>
			<% 
			List<Student>students=(ArrayList<Student>)request.getAttribute("students");
			%>
			<%
			System.out.println(students);
			%>
			<%for(Student s : students) {
			%>
			<tr>
				<td><%=s.getFirstName()%></td>
				<td><%=s.getLastName()%></td>
				<td><%=s.getEmail()%></td>
				<td><%=s.getPhoneNumber()%></td>
				<td><%=s.getDateOfBirth()%></td>
				<td><%=s.getCourse()%></td>
				<td><%=s.getMaritalStatus()%></td>
			</tr>
			<%
			}
			%>
		</table>
	</div>


	<a href="http://localhost:8080/MyRegisterProject/login.jsp">logout</a>
	<br>

</body>
</html>