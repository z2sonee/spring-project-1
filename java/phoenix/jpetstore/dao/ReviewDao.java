package phoenix.jpetstore.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;

import phoenix.jpetstore.domain.Review;

public interface ReviewDao {

  List<Review> getReviewList() throws DataAccessException;
  
  Review getReviewsByReviewId(int reviewId) throws DataAccessException;

  void insertReview(int reviewId, String reviewTitle, String reviewContent, int userId, String reviewItemName, String reviewItemPrice) throws DataAccessException;
  
//  void updateReview(int reviewId, String reviewTitle, String reviewContent, int userId, String reviewItemName, String reviewItemPrice) throws DataAccessException;
  
  void deleteReview(int reviewId) throws DataAccessException;
  
  int findUserId(String loginId) throws DataAccessException;

}