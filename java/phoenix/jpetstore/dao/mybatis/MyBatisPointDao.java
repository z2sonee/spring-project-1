package phoenix.jpetstore.dao.mybatis;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import phoenix.jpetstore.dao.PointDao;
import phoenix.jpetstore.dao.mybatis.mapper.PointMapper;
import phoenix.jpetstore.domain.Account;
import phoenix.jpetstore.domain.ViewPoint;

@Repository
public class MyBatisPointDao implements PointDao{
   
   @Autowired
   private PointMapper pointMapper;
   
   /*
    * @Transactional public Account getAccount(int userId) { Account account =
    * pointMapper.getAccount(userId); return account; }
    */
   @Transactional
   public List<ViewPoint> getPointList(int userId) throws DataAccessException{
      return pointMapper.getPointList(userId);
   }
   
   public Account getAccount(int userId) throws DataAccessException {
	   return pointMapper.getAccount(userId);
   }
   
   @Override
   public void insertPointInfo(int pointNum, int userId, String pointInfo, int totalPoint) throws DataAccessException{
      pointMapper.insertPointInfo(pointNum, userId, pointInfo, totalPoint);
      
   }
   
   @Override
   public void updateAccountPoint(int userId, int point) throws DataAccessException{
      pointMapper.updateAccountPoint( userId, point);
      
   }
   
   @Override
   public void updateTotalPoint(int userId, int totalPoint) throws DataAccessException {
      pointMapper.updateTotalPoint(userId, totalPoint);
   }
   
   public int getPointFromAccount(int userId) throws DataAccessException {
      return pointMapper.getPointFromAccount(userId);
   }
   
//   @Override
//   public void insertPoint(int pointNum, String pointInfo, int totalPoint) throws DataAccessException {
//      pointMapper.insertPoint(pointNum, pointInfo, totalPoint);
//   }
}