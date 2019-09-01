package phoenix.jpetstore.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Review implements Serializable {
   
   private int reviewId;
   private String reviewTitle;
   private String reviewItemName;
   private String reviewItemPrice;
   private String reviewContent;
   //private String reviewPic;
   private Account account;
   private List<Comment> comments;
   //= new ArrayList<Comment>();
   //private Date reviewDate;
   
   
   public int getReviewId() {
      return reviewId;
   }

   public void setReviewId(int reviewId) {
      this.reviewId = reviewId;
   }
   public String getReviewTitle() {
      return reviewTitle;
   }
   public void setReviewTitle(String reviewTitle) {
      this.reviewTitle = reviewTitle;
   }
   public String getReviewItemName() {
      return reviewItemName;
   }
   public void setReviewItemName(String reviewItemName) {
      this.reviewItemName = reviewItemName;
   }
   public String getReviewItemPrice() {
      return reviewItemPrice;
   }
   public void setReviewItemPrice(String reviewItemPrice) {
      this.reviewItemPrice = reviewItemPrice;
   }
   public String getReviewContent() {
      return reviewContent;
   }
   public void setReviewContent(String reviewContent) {
      this.reviewContent = reviewContent;
   }
   public Account getAccount() {
      return account;
   }
   public void setAccount(Account account) {
      this.account = account;
   }
   public List<Comment> getComments() {
      return comments;
   }
   public void setComments(List<Comment> comments) {
      this.comments = comments;
   }


   
   
   
   
}