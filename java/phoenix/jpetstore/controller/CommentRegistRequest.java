package phoenix.jpetstore.controller;

import java.util.Date;

public class CommentRegistRequest {
   private String commentId;
   private String commContent;
   private Date commDate;
   public String getCommentId() {
      return commentId;
   }
   public void setCommentId(String commentId) {
      this.commentId = commentId;
   }
   public String getCommContent() {
      return commContent;
   }
   public void setCommContent(String commContent) {
      this.commContent = commContent;
   }
   public Date getCommDate() {
      return commDate;
   }
   public void setCommDate(Date commDate) {
      this.commDate = commDate;
   }
   
   

}