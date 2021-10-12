package za.co.unisa.controllers;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import za.co.unisa.models.Student;
import za.co.unisa.services.StudentService;

public class StudentServlet  extends HttpServlet{
	
	List<Student>students=new ArrayList<>();
	StudentService sc=null;
	private static final long serialVersionUID = 1L;


	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		   
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
		String email = request.getParameter("email");
		String phoneNumber = request.getParameter("phoneNumber");
		String dateOfBirth = request.getParameter("dateOfBirth");
		String course = request.getParameter("course");
		String maritalStatus = request.getParameter("maritalStatus");
		
		
		sc=new StudentService();
		Student student= new Student(firstName,lastName,email,phoneNumber,dateOfBirth,course,maritalStatus);
		
		 sc.registerStudent(student);
		 
		
try {
	request.setAttribute("student",student);
	request.getRequestDispatcher("studentRegistrationSucess.jsp").forward(request, response);
}catch(ServletException|IOException e) {
	e.printStackTrace();
	
	
}
}
	protected void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
		
		
		List<Student>students=sc.displayStudent();
		
		try {
		request.setAttribute("students", students);
		request.getRequestDispatcher("welcome.jsp").forward(request, response);
		}catch(IOException|ServletException e) {
			e.printStackTrace();		
		}catch(NullPointerException e) {}
	}
}