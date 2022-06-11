package com.sush.Di;

import org.springframework.stereotype.Component;


public class Student {
	
    private String studname; 
    
    public Student() {
    	throw new NullPointerException();
    
    
    }
    
  //student name is a dependency  
    //MAKE IT PRIVATE NO EXPOSE VARAIBLE SO CREATE SETTER METHOD
    
   public void setStudname(String studname) {
		this.studname = studname;
	}

	}
	
/*public Student(String studname) {
		super();
		this.studname = studname;
	}
*/
public void displayStudentInfo() {
		  System.out.println("Student name is = " +studname );
	}
}
