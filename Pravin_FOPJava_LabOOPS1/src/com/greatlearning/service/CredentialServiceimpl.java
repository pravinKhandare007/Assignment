package com.greatlearning.service;

import com.greatlearning.model.Employee;

public class CredentialServiceimpl implements CredentialService{
	
	@Override
	public String generatePassword() {
		char[] capital = new char[]{'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
		char[] small = new char[]{'a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z'};
		int[] integers = new int[] {'0','1','2','3','4','5','6','7','8','9'};
		char[] specialchar = new char[] {'@','#','$','%','&'}; 
		
		String password = "";
		//for 4 small character
		for(int i=0; i < 4; i++) {
			int rand = (int)(Math.random() * 26);
			password += small[rand]; 
		}
		
		//for 1 capital letter
		password += capital[(int)(Math.random() * 26)]; 
		
		//for special character
		password += specialchar[(int)(Math.random() * 5)]; 
		
		//for an integer character
		for(int i=0; i < 2; i++) {  
			password += integers[(int)(Math.random() * 10)]; 
		}
		
		return password;
		
		
		
	}

	@Override
	public String generateEmailAddress(Employee obj, String department,String company) {
		// TODO Auto-generated method stub
		return obj.getFirstName() + obj.getLastName() + "@" + department + company + ".com";
		
	}

	@Override
	public void showCredentials(Employee obj,String generatedPassword, String email) {
		System.out.println("dear "+ obj.getFirstName() + " your generated credentials are as follows" );
		System.out.println("email   ---> " + email);
		System.out.println("password---> " + generatedPassword);	
	}

}
