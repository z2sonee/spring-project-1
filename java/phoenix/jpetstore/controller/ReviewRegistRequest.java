package phoenix.jpetstore.controller;

import java.util.Date;

import phoenix.jpetstore.domain.Account;

public class ReviewRegistRequest {
   private String reviewId;
   private Date reviewDate;
   private String reviewTitle;
   private String reviewItemName;
   private String reviewItemPrice;
   private String reviewContent;
   //private String reviewPic;
   
   private Account account;
   
   public String getReviewId() {
      return reviewId;
   }
   public void setReviewId(String reviewId) {
      this.reviewId = reviewId;
   }
   public Date getReviewDate() {
      return reviewDate;
   }
   public void setReviewDate(Date reviewDate) {
      this.reviewDate = reviewDate;
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
   
}