package phoenix.jpetstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import phoenix.jpetstore.domain.Comment;
import phoenix.jpetstore.service.CommentService;

@Controller
@RequestMapping("/ModifyCommentForm/{commentId}")
public class ModifyCommentController {

   private static final String MODIFY_COMMENT_FORM = "jsp/ModifyCommentForm";
   private static final String REVIEW_NOT_FOUND_VIEW = "jsp/ReviewNotFound";
   
   @Autowired
   private CommentService commentService;

   @RequestMapping(method = RequestMethod.GET)
   public String form(@ModelAttribute("comodReq") CommentModRequest comodReq,
         @PathVariable("commentId") String commentId) {
      Comment comment = commentService.getCommentList(commentId);
      if (comment == null)
         return REVIEW_NOT_FOUND_VIEW;

      comodReq.setCommentId(comment.getCommentId());
      comodReq.setCommContent(comment.getCommContent());
      
      return MODIFY_COMMENT_FORM;
   }

   @RequestMapping(method = RequestMethod.POST)
   public String modify(@ModelAttribute("comodReq") CommentModRequest comodReq) {
      if(comodReq == null)
         return REVIEW_NOT_FOUND_VIEW;
         
      commentService.modifyCommentList(comodReq);
      return "jsp/CommentModified";
   }

   public void setCommentService(CommentService commentService) {
      this.commentService = commentService;
   }

}
