package mum.edu.alphabetstore.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import mum.edu.alphabetstore.domain.User;
import mum.edu.alphabetstore.repository.UserRepository;
import mum.edu.alphabetstore.service.UserService;

@Service
@Transactional
public class UserServiceImpl implements UserService{

	@Autowired
	UserRepository userRepository;
	
	@Override
	public void addUser(User user) {
		userRepository.save(user);
	}
	
	@Override
	public User getUserByUsername(String username) {
		
		return userRepository.findUserByUsername(username);
	}
}
