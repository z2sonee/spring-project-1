package phoenix.jpetstore.service;

import java.util.List;

import phoenix.jpetstore.domain.ViewPoint;

public interface PointService {
   List<ViewPoint> getPointList(int pointNum);
   void insertPoint(int pointNum, String pointInfo, int totalPoint);
}