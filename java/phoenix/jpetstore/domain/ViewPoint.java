package phoenix.jpetstore.domain;

import java.io.Serializable;

public class ViewPoint implements Serializable{
   private int pointNum; //포인트 적립 내역 번호
   private int userId; //포인트 적립 대상
   private String pointInfo; //포인트 적립 내역 상세
   private int totalPoint; //포인트 총합계
   private Account account;
   
   public int getPointNum() {
      return pointNum;
   }
   public void setPointNum(int pointNum) {
      this.pointNum = pointNum;
   }
   public int getUserId() {
      return userId;
   }
   public void setUserId(int userId) {
      this.userId = userId;
   }
   public String getPointInfo() {
      return pointInfo;
   }
   public void setPointInfo(String pointInfo) {
      this.pointInfo = pointInfo;
   }
   public Account getAccount() {
      return account;
   }
   public void setAccount(Account account) {
      this.account = account;
   }
   public int getTotalPoint() {
      return totalPoint;
   }
   public void setTotalPoint(int totalPoint) {
      this.totalPoint = totalPoint;
   }
   
@Override
   public String toString() {
      return "Point Info [" + "pointNum=" + pointNum + ", " + "pointInfo=" + pointInfo + "totalPoint=" + totalPoint + "]";
   }
   
}