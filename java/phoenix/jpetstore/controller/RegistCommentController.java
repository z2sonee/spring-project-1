package phoenix.jpetstore.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import phoenix.jpetstore.service.CommentService;
import phoenix.jpetstore.validator.CommentRegisterValidator;

@Controller
@RequestMapping("/WriteCommentForm")
public class RegistCommentController {
   private static final String COMMENT_REGISTRATION_FORM = "jsp/WriteCommentForm";
   @Autowired private CommentService commentService;
   
   
   @ModelAttribute("commRegReq")// request handler methods 보다 먼저 호출됨
   public CommentRegistRequest formBacking(HttpServletRequest request) {
      return new CommentRegistRequest();
   }
   
   @RequestMapping(method = RequestMethod.GET)
   public String form() {
      return COMMENT_REGISTRATION_FORM;
   }
   
   @RequestMapping(method = RequestMethod.POST)
   public String register(
         @ModelAttribute("commRegReq") CommentRegistRequest commRegReq,
         BindingResult bindingResult, Model model) {      
      System.out.println("command 객체: " + commRegReq);
      
      new CommentRegisterValidator().validate(commRegReq, bindingResult);
      if (bindingResult.hasErrors()) {
         return COMMENT_REGISTRATION_FORM;
      }
      
      String commentId = commentService.registerNewComment(commRegReq);
      model.addAttribute("commentId", commentId);
      return "jsp/CommentRegistered";
   }
   
   public void setCommentService(CommentService commentService) {
      this.commentService = commentService;
   }
   
}