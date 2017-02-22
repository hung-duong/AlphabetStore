package mum.edu.alphabetstore.service;

import mum.edu.alphabetstore.domain.UserCredentials;

public interface UserCredentialService {
	UserCredentials findOne(String username);
	void addCustomer(UserCredentials user);
}
