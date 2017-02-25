package mum.edu.alphabetstore.service.impl;

import mum.edu.alphabetstore.domain.UserCredentials;
import mum.edu.alphabetstore.repository.UserCredentialRepository;
import mum.edu.alphabetstore.service.UserCredentialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserCredentialImpl implements UserCredentialService{

	@Autowired
	UserCredentialRepository userCredentialRepository;
	
	@Override
	public UserCredentials findOne(String username) {
		return (UserCredentials) userCredentialRepository.findOne(username);
	}

	@Override
	public void addCustomer(UserCredentials user) {
		user.setEnabled(true);
		userCredentialRepository.save(user);
	}
}
