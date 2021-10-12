package za.co.unisa.controllers;
import java.util.*;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import za.co.unisa.models.Student;
import za.co.unisa.models.User;
import za.co.unisa.services.StaffService;
import za.co.unisa.services.StudentService;

public class LoginServlet extends HttpServlet{
	
	

public LoginServlet() {
		super();
		// TODO Auto-generated constructor stub
	}



private static final long serialVersionUID = 1L;


protected void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
	
	StudentService sc=new StudentService();
	List<Student>students=sc.displayStudent();
	request.setAttribute("students", students);
	request.getRequestDispatcher("welcome.jsp").forward(request,response);
}


protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	String username = request.getParameter("username");
	String password= request.getParameter("password");

User user=new User(username,password);
StaffService staffservice=new StaffService();
boolean status=staffservice.login(user);
String error="Invalid username or password ";
if (status) {
	doGet(request,response);
}else {
	
	request.setAttribute("error", error);
	request.getRequestDispatcher("login.jsp").forward(request, response);
	
	
	
	
}


}
}