package com.greatlearning.service;

import com.greatlearning.model.Employee;

public interface CredentialService {
	public String generatePassword();
	
	public String generateEmailAddress(Employee obj, String department,String company );
	
	public void showCredentials(Employee obj,String generatedPassword, String email);
}
