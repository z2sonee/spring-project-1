package phoenix.jpetstore.service;

import java.util.List;


import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import phoenix.jpetstore.dao.AccountDao;
import phoenix.jpetstore.dao.PointDao;
import phoenix.jpetstore.dao.ReviewDao;
import phoenix.jpetstore.domain.Account;
import phoenix.jpetstore.domain.Review;
import phoenix.jpetstore.domain.ViewPoint;

@Service
@Transactional
public class PetStoreImpl implements PetStoreFacade {
   @Autowired
   private ReviewDao reviewDao;
   @Autowired
   private PointDao pointDao;
   
   public List<Review> getReviewList() {
      return reviewDao.getReviewList();
   }

   @Override
   public void insertReview(int reviewId, String reviewTitle, String reviewContent, int userId, String reviewItemName, String reviewItemPrice) {
      reviewDao.insertReview(reviewId, reviewTitle, reviewContent, userId, reviewItemName, reviewItemPrice);
      
   }

//   @Override
//   public void updateReview(int reviewId, String reviewTitle, String reviewContent, int userId, String reviewItemName, String reviewItemPrice) {
//      reviewDao.updateReview(reviewId, reviewTitle, reviewContent, userId, reviewItemName, reviewItemPrice);
//      
//   }

   @Override
   public Review getReviewsByReviewId(int reviewId) {
      return (Review) reviewDao.getReviewsByReviewId(reviewId);
   }

   @Override
   public void deleteReview(int reviewId) {
      // TODO Auto-generated method stub
      reviewDao.deleteReview(reviewId);
   }
   
   public int findUserId(String loginId) {
      return reviewDao.findUserId(loginId);
   }
   
   
   	public List<ViewPoint> getPointList(int userId) {
         return pointDao.getPointList(userId);
      }
   	
   	public Account getAccount(int userId) {
   		return pointDao.getAccount(userId);
   	}
      
      @Override
      public void insertPointInfo(int pointNum, int userId, String pointInfo, int totalPoint) {
         pointDao.insertPointInfo(pointNum, userId, pointInfo, totalPoint);
         
      }
      
      @Override
      public void updateAccountPoint (int userId, int point) {
         pointDao.updateAccountPoint(userId, point);
         
      }
      
      @Override
      public void updateTotalPoint (int userId, int totalPoint) {
         pointDao.updateTotalPoint(userId, totalPoint);
         
      }
      
      @Override
      public int getPointFromAccount(int userId) {
         return pointDao.getPointFromAccount(userId);
         
      }
   
}