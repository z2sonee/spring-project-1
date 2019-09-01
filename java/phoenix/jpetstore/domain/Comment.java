package phoenix.jpetstore.domain;

import java.io.Serializable;
import java.util.Date;

public class Comment implements Serializable {
   
   private String commentId;
   private String commContent;
   private Date commDate;
   
   private int reviewId;
   private int userId;
   
   public Comment(String commentId, String commContent, Date commDate) {
      super();
      this.commentId = commentId;
      this.commContent = commContent;
      this.commDate = commDate;
   }

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

   public int getReviewId() {
      return reviewId;
   }

   public void setReviewId(int reviewId) {
      this.reviewId = reviewId;
   }

   public int getUserId() {
      return userId;
   }

   public void setUserId(int userId) {
      this.userId = userId;
   }
   
   
}