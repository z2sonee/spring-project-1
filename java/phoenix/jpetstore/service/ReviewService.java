package phoenix.jpetstore.service;

import java.util.List;

import org.springframework.dao.DataAccessException;

import phoenix.jpetstore.domain.Review;

public interface ReviewService {
   List<Review> getReviewList();
   
   void insertReview(int reviewId, String reviewTitle, String reviewContent, int userId, String reviewItemName, String reviewItemPrice);

//   void updateReview(int reviewId, String reviewTitle, String reviewContent, int userId, String reviewItemName, String reviewItemPrice);

   void deleteReview(int reviewId);
   
   Review getReviewsByReviewId(int reviewId);
   
   int findUserId(String loginId) throws DataAccessException;
}