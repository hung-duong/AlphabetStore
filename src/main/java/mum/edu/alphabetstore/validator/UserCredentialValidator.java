package mum.edu.alphabetstore.validator;

import mum.edu.alphabetstore.domain.UserCredentials;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

@Component
public class UserCredentialValidator implements Validator{

	@Override
	public boolean supports(Class<?> clazz) {
		return UserCredentials.class.isAssignableFrom(clazz);
	}

	@Override
	public void validate(Object obj, Errors errors) {
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "username", "NotEmpty.UserCredentials");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "NotEmpty.UserCredentials");
		UserCredentials tmp = (UserCredentials)obj;
		if(tmp.getPassword().length() < 8 || tmp.getPassword().length() > 32)
			errors.rejectValue("password", "Size.password");
	}

}
