package phoenix.jpetstore.validator;

import org.springframework.validation.Errors;

import phoenix.jpetstore.controller.ReviewRegistRequest;

public class ReviewRegisterValidator {
   public boolean supports(Class<?> clazz) {
      return ReviewRegistRequest.class.isAssignableFrom(clazz);
   }

   public void validate(Object target, Errors errors) {
      ReviewRegistRequest reviewRegReq = (ReviewRegistRequest) target;
      
   }
}