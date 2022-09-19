package com.greatlearning.test;

import java.util.Scanner;
import com.greatlearning.model.Employee;
import com.greatlearning.service.*;

public class TestClass {
	
	
	
	public static void main(String[] args) {
		Employee emp = new Employee("Jaisingh","Khandare");
		CredentialService cs = new CredentialServiceimpl();
		Scanner scanner = new Scanner(System.in);
		String company = "Tesla";
		
		
		System.out.println("Please enter the department from the following");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");
		
		String option = scanner.nextLine();
		String department = null;
		switch(option) {
		case "1":  
			department = "tech"; 
			break;
			
		case "2":  
			department = "admin"; 
			break;
			
		case "3":  
			department = "hr"; 
			break;
			
		case "4":  
			department = "legal"; 
			break;
		}
		
		String email = cs.generateEmailAddress(emp, department , company).toLowerCase();
		String password = cs.generatePassword();
		cs.showCredentials(emp,password, email);
	
		scanner.close();
	}	
}
