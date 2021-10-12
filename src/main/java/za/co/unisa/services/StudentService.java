package za.co.unisa.services;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import za.co.unisa.dao.JdbcConnection;
import za.co.unisa.models.Student;

public class StudentService {
	
	List<Student> displayStudent = new ArrayList<>();
	

	 private Student student=null;
	List<Student> searchStudent = new ArrayList<>();
	JdbcConnection jdbc = new JdbcConnection();
	int rowsAffacted = 0;
	ResultSet res=null;

	public int registerStudent(Student student) {
		String studentQuery = "INSERT INTO Student(first_name, last_name, email, phone_number, date_Of_Birth, course,maritalStatus)"
				+ "VALUES('" + student.getFirstName() + "','" + student.getLastName() + "','" + student.getEmail()
				+ "','" + student.getPhoneNumber() + "','"

				+ student.getDateOfBirth() + "','" + student.getCourse() + "','" + student.getMaritalStatus() + "')";

		

		
		try {

			rowsAffacted = JdbcConnection.executeQuery(studentQuery);

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return rowsAffacted;
	}

	
	public List<Student> displayStudent() {
		String query = "SELECT * FROM Student";
		
		String firstName = null;
		String lastName = null;
		String email = null;
		String phoneNumber = null;
		String dateOfBirth = null;
		String course = null;
		String maritalStatus = null;

		

		try {
			res = JdbcConnection.getResultSet(query);

			while (res.next()) {

				firstName = res.getString("first_name");
				lastName = res.getString("last_name");
				email = res.getString("email");
				phoneNumber = res.getString("phone_number");
				dateOfBirth = res.getString("date_Of_Birth");
				course = res.getString("course");
				maritalStatus = res.getString("maritalStatus");

				 student = new Student(firstName, lastName, email, phoneNumber, dateOfBirth,
						course, maritalStatus);
				displayStudent.add(student);

			}

		} catch (SQLException e) {
			e.printStackTrace();
		}
		return displayStudent;

	
	}
	public List<Student> searchStudent(String identifier, String search) {
		// with the searchStudent you can search  a particular student in the database and display it on the web page in a table format 
		String query = "SELECT * FROM Student WHERE "+identifier+" LIKE '"+search+"%'";
		String firstName = null;
		String lastName = null;
		String email = null;
		String phoneNumber = null;
		String dateOfBirth = null;
		String course = null;
		String maritalStatus = null;
		

	

		switch (identifier) {

		case "last_name":{

			try {

				res = JdbcConnection.getResultSet(query);

				while (res.next()) {

					firstName = res.getString("first_name");
					lastName = res.getString("last_name");
					email = res.getString("email");
					phoneNumber = res.getString("phone_number");
					dateOfBirth = res.getString("date_Of_Birth");
					course = res.getString("course");
					maritalStatus = res.getString("maritalStatus");

					

					student = new Student(firstName, lastName, email, phoneNumber, dateOfBirth,
							course, maritalStatus);
					displayStudent.add(student);

				}

			} catch (SQLException e) {
			System.out.println(displayStudent);

			break;
		}
		}
		case "email":{

			try {

				res = JdbcConnection.getResultSet(query);

				while (res.next()) {

					firstName = res.getString("first_name");
					lastName = res.getString("last_name");
					email = res.getString("email");
					phoneNumber = res.getString("phone_number");
					dateOfBirth = res.getString("date_Of_Birth");
					course = res.getString("course");
					maritalStatus = res.getString("maritalStatus");

					

					student = new Student(firstName, lastName, email, phoneNumber, dateOfBirth,
							course, maritalStatus);
					displayStudent.add(student);

				}

			} catch (SQLException e) {
				
			
			System.out.println(displayStudent);
			
			break;
		}
		}
		case "first_name":{

			try {

				res = JdbcConnection.getResultSet(query);

				while (res.next()) {

					firstName = res.getString("first_name");
					lastName = res.getString("last_name");
					email = res.getString("email");
					phoneNumber = res.getString("phone_number");
					dateOfBirth = res.getString("date_Of_Birth");
					course = res.getString("course");
					maritalStatus = res.getString("maritalStatus");

					

					 student = new Student(firstName, lastName, email, phoneNumber, dateOfBirth,
							course, maritalStatus);
					displayStudent.add(student);

				}

			} catch (SQLException e) {
			
			System.out.println(displayStudent);

		}	break;
		}
		case "phone_number":{

			try {

				res = JdbcConnection.getResultSet(query);

				while (res.next()) {

					firstName = res.getString("first_name");
					lastName = res.getString("last_name");
					email = res.getString("email");
					phoneNumber = res.getString("phone_number");
					dateOfBirth = res.getString("date_Of_Birth");
					course = res.getString("course");
					maritalStatus = res.getString("maritalStatus");

					

					student = new Student(firstName, lastName, email, phoneNumber, dateOfBirth,
							course, maritalStatus);
					displayStudent.add(student);

				}

			} catch (SQLException e) {
				
			System.out.println(displayStudent);

			break;
		}
		}
		}
		return displayStudent;

	}// method

}// class
