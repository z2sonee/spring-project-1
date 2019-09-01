package phoenix.jpetstore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import phoenix.jpetstore.domain.Comment;
import phoenix.jpetstore.service.CommentService;

@Controller
public class CommentController {
   @Autowired CommentService commentService;
   
   @RequestMapping("/CommentBoard")
   public String commentList(Model model) {
      List<Comment> comments = commentService.getComments();
      model.addAttribute("comments", comments);
      return "jsp/CommentBoard";
   }
   @RequestMapping("/CommentDetail/{commentId}")
   public String commentDetail(@PathVariable String commentId, Model model) {
      Comment comment = commentService.getCommentList(commentId);
      if (comment == null) {
         return "jsp/ReviewNotFound";
      }
      model.addAttribute("comment", comment);
      return "jsp/CommentDetail";
   }
   
   public void setCommentService(CommentService commentService) {
      this.commentService = commentService;
   }
   
   
}