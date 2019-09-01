package phoenix.jpetstore.controller;

public class CommentModRequest {

   private String commentId;
   private String commContent;
   
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
   
   
}