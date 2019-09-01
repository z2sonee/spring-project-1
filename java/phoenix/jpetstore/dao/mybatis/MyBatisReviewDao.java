package phoenix.jpetstore.dao.mybatis;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import phoenix.jpetstore.dao.ReviewDao;
import phoenix.jpetstore.dao.mybatis.mapper.ReviewMapper;
import phoenix.jpetstore.domain.Review;

@Repository
public class MyBatisReviewDao implements ReviewDao {

   @Autowired
   private ReviewMapper reviewMapper;
   
   @Transactional
   public List<Review> getReviewList() throws DataAccessException {
      return reviewMapper.getReviewList();
   }

   @Override
   public Review getReviewsByReviewId(int reviewId) throws DataAccessException {
      // TODO Auto-generated method stub
      return reviewMapper.getReviewsByReviewId(reviewId);
   }

   @Override
   public void insertReview(int reviewId, String reviewTitle, String reviewContent, int userId, String reviewItemName, String reviewItemPrice) throws DataAccessException {
      reviewMapper.insertReview(reviewId, reviewTitle, reviewContent, userId, reviewItemName, reviewItemPrice);
      
   }
   
   @Override
   public int findUserId(String loginId) throws DataAccessException {
   	// TODO Auto-generated method stub
   	return reviewMapper.findUserId(loginId);
   }

//   @Override
//   public void updateReview(int reviewId, String reviewTitle, String reviewContent, int userId, String reviewItemName, String reviewItemPrice) throws DataAccessException {
//      reviewMapper.updateReview(reviewId, reviewTitle, reviewContent, userId, reviewItemName, reviewItemPrice);
//      
//   }

   @Override
   public void deleteReview(int reviewId) throws DataAccessException {
      reviewMapper.deleteReview(reviewId);
      
   }

   /*
    * public void insertReview(Review review) throws DataAccessException {
    * reviewMapper.insertReview(review); }
    * 
    * public void updateReview(Review review) throws DataAccessException {
    * reviewMapper.updateReview(review); // accountMapper.updateProfile(account);
    * // if (account.getPassword() != null && account.getPassword().length() > 0)
    * // { // accountMapper.updateSignon(account); // } }
    * 
    * 
    * @Override public List<Review> getReviewsByReviewId(String reviewId) throws
    * DataAccessException { // TODO Auto-generated method stub return
    * reviewMapper.getReviewsByReviewId(reviewId); }
    */


}