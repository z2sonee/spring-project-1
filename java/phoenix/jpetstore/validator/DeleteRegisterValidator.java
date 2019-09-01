package phoenix.jpetstore.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import phoenix.jpetstore.controller.DeleteRegistRequest;

public class DeleteRegisterValidator implements Validator{
	@Override
	public boolean supports(Class<?> clazz) {
		return DeleteRegistRequest.class.isAssignableFrom(clazz);
	}

	public void validate(Object target, Errors errors) {
		DeleteRegistRequest deleteRegReq = (DeleteRegistRequest) target;
		
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "currentPassword", "required.currentPassword");
		
		/*if (deleteRegReq.getCurrentPassword() != item.getPassword()) {
			ValidationUtils.rejectIfEmptyOrWhitespace(errors, "password", "notMatchPassword");
		}
		*/
		//이 부분 다시 하기
		if (deleteRegReq.isAgreement() == false) {
			ValidationUtils.rejectIfEmptyOrWhitespace(errors, "agreement", "agreement");
		}
	}
}
