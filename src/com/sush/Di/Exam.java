package com.sush.Di;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Exam {
	
	public static void main(String[] args) {
		
		//Student s= new Student();
		// s.name ="sushmitha";
		//s.setName("sushmitha");
		///s.displayStudentInfo();
		
	//	System.out.println("Student name is = " +s.name );
// HERE  IN THIS CLASS  I SHOULDNT EXPOSE MY VARAIABLE IN THIS DIFF CLASS SO USE PRIVATE 		
		

	ApplicationContext context = new ClassPathXmlApplicationContext("beans1.xml");

		System.out.println("config loaded");
		               
		     Student ss =context.getBean("stud1",Student.class);
		         ss.displayStudentInfo();
	System.out.println("yay");

	
	}
	
	

}
