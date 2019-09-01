package phoenix.jpetstore.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;

import phoenix.jpetstore.domain.Account;
import phoenix.jpetstore.domain.Review;
import phoenix.jpetstore.domain.ViewPoint;

public interface PointDao {

  List<ViewPoint> getPointList(int userId) throws DataAccessException;
  
  Account getAccount(int userId) throws DataAccessException;

  void insertPointInfo(int pointNum, int userId, String pointInfo, int totalPoint);

  void updateAccountPoint( int userId, int point);
  
  void updateTotalPoint(int userId, int totalPoint);
  
  int getPointFromAccount(int userId);

}