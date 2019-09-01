package phoenix.jpetstore.validator;



import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import phoenix.jpetstore.controller.AccountRegistRequest;
public class AccountRegisterValidator implements Validator{
	@Override
	public boolean supports(Class<?> clazz) {
		return AccountRegistRequest.class.isAssignableFrom(clazz);
	}

	public void validate(Object target, Errors errors) {
		
	}}
