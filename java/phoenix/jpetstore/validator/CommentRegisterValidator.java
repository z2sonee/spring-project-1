package phoenix.jpetstore.validator;

import org.springframework.validation.Errors;

import phoenix.jpetstore.controller.CommentRegistRequest;

public class CommentRegisterValidator {
   public boolean supports(Class<?> clazz) {
      return CommentRegistRequest.class.isAssignableFrom(clazz);
   }

   public void validate(Object target, Errors errors) {
      CommentRegistRequest commRegReq = (CommentRegistRequest) target;
      
   }
}