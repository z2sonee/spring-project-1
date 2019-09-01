package phoenix.jpetstore.validator;

import org.springframework.validation.Errors;

import phoenix.jpetstore.controller.BidRegistRequest;

public class BidRegisterValidator {
   public boolean supports(Class<?> clazz) {
      return BidRegistRequest.class.isAssignableFrom(clazz);
   }

   public void validate(Object target, Errors errors) {
      BidRegistRequest bidRegReq = (BidRegistRequest) target;
      
   }
}