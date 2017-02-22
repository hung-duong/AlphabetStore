package mum.edu.alphabetstore.service;

import mum.edu.alphabetstore.domain.User;

public interface UserService {
	void addUser(User user);
	
	User getUserByUsername(String username);
}
