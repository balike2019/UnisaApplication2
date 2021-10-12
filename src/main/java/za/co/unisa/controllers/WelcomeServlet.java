package za.co.unisa.controllers;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import za.co.unisa.models.Student;
import za.co.unisa.services.StudentService;

public class WelcomeServlet  extends HttpServlet{
	private StudentService sc;
	private static final long serialVersionUID = 1L;
	private List<Student>students;
	
	protected void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException ,IOException {
		 sc=new StudentService(); 
		
		String identifier=request.getParameter("identifier");
		String search=request.getParameter("searchBox");
	
		String result="";
		students=sc.searchStudent(identifier, search);
		
		if(students.size()==1) 
			
			result=students.size() +"result found";
		else 
			result=students.size() +"result found";
				
		
	
			
		if(search.equals("") || identifier.equals("")) {
			
			request.setAttribute("result",result);
			request.getRequestDispatcher("/welcome.jsp").forward(request, response);
		}else {
	
		
		request.setAttribute("students",students);
		request.setAttribute("result",result);
		}request.getRequestDispatcher("/welcome.jsp").forward(request, response);
			
		
		
		
		
	}

}
