package phoenix.jpetstore.validator;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import phoenix.jpetstore.controller.ItemRegistRequest;

public class ItemRegisterValidator implements Validator {
	@Override
	public boolean supports(Class<?> clazz) {
		return ItemRegistRequest.class.isAssignableFrom(clazz);
	}

	public void validate(Object target, Errors errors) {

		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "itemName", "required.itemName");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "itemPrice", "required.itemPrice");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "itemBidEndTime", "required.itemBidEndTime");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "itemInfo", "required.itemInfo");
	
	}
}
