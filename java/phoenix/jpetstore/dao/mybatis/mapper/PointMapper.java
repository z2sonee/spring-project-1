package phoenix.jpetstore.dao.mybatis.mapper;

import java.util.List;

import org.springframework.dao.DataAccessException;

import phoenix.jpetstore.domain.Account;
import phoenix.jpetstore.domain.ViewPoint;

public interface PointMapper {
   //Account getAccount(int userId);
   List<ViewPoint> getPointList(int userId);
   Account getAccount(int userId);
   void insertPointInfo(int pointNum, int userId, String pointInfo, int totalPoint);
   void updateAccountPoint(int userId, int point);
   void updateTotalPoint(int userId, int totalPoint);
   int getPointFromAccount(int userId);
}