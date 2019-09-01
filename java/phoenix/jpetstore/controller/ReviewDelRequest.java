package phoenix.jpetstore.controller;

public class ReviewDelRequest {
   
   private String reviewId;
   private String reviewTitle;
   private String reviewItemName;
   private String reviewItemPrice;
   private String reviewContent;
   private String reviewPic;
   private String password;
   
   
   
   
   public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}
public String getReviewId() {
      return reviewId;
   }
   public void setReviewId(String reviewId) {
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
   public String getReviewPic() {
      return reviewPic;
   }
   public void setReviewPic(String reviewPic) {
      this.reviewPic = reviewPic;
   }
   
}