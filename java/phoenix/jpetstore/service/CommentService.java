package phoenix.jpetstore.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.support.PagedListHolder;
import org.springframework.stereotype.Service;

import phoenix.jpetstore.controller.CommentModRequest;
import phoenix.jpetstore.controller.CommentRegistRequest;
import phoenix.jpetstore.domain.Comment;


@Service
public class CommentService {
      private int nextCommentId = 0;
      private Map<String, Comment> commentMap = new HashMap<String, Comment>();
      private final PagedListHolder<Comment> commentList = new PagedListHolder<Comment>();
      
      public CommentService() {
         commentMap.put("c1", new Comment("c1", "저도 사고싶네용", new Date()));
         nextCommentId = 2;
      }
      
      public Comment getCommentList(String commentId) {
         return commentMap.get(commentId);
      }
      
      public void modifyCommentList(CommentModRequest comodReq) {
         Comment comment = commentMap.get(comodReq.getCommentId());
         
         comment.setCommentId(comodReq.getCommentId());
         comment.setCommContent(comodReq.getCommContent());

      }
      
      public List<Comment> getComments() {
         return new ArrayList<Comment>(commentMap.values());
      }
      
      public String registerNewComment(CommentRegistRequest commRegReq) {
         Comment comment = new Comment("c" + nextCommentId, 
               commRegReq.getCommContent(), commRegReq.getCommDate());
         nextCommentId++;
         commentMap.put(comment.getCommentId(), comment);
         return comment.getCommentId();
         
      }
      
//      public String removeReviewById(ReviewModRequest modReq) {
//         Review review = reviewMap.get(modReq.getReviewId());
//         
//         reviewList.getSource().remove(review);
//         return review.getReviewId();
//         
//      }
      

   }