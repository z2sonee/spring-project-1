package phoenix.jpetstore.service;

import java.util.List;

import org.springframework.dao.DataAccessException;

import phoenix.jpetstore.domain.Account;
import phoenix.jpetstore.domain.Review;
import phoenix.jpetstore.domain.ViewPoint;

public interface PetStoreFacade {

   List<Review> getReviewList();

   void insertReview(int reviewId, String reviewTitle, String reviewContent, int userId, String reviewItemName, String reviewItemPrice);

//   void updateReview(int reviewId, String reviewTitle, String reviewContent, int userId, String reviewItemName, String reviewItemPrice);
   
   void deleteReview(int reviewId);

   Review getReviewsByReviewId(int reviewId);
   
   int findUserId(String loginId);
   
   /*추가*/
  
   List<ViewPoint> getPointList(int userId);
   
   Account getAccount(int userId);

   void insertPointInfo(int pointNum, int userId, String pointInfo, int totalPoint);
   
   void updateAccountPoint(int userId, int point);
   
   void updateTotalPoint(int userId, int totalPoint);

   int getPointFromAccount(int userId);

}