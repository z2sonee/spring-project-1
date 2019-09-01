package phoenix.jpetstore.controller;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class BidRegistRequest {
   private String itemId;
   private String bidId;
   private int bidPrice;
   private String bidTime;//현재시간

   public String getItemId() {
      return itemId;
   }

   public void setItemId(String itemId) {
      this.itemId = itemId;
   }

   public String getBidId() {
      return bidId;
   }

   public void setBidId(String bidId) {
      this.bidId = bidId;
   }

   public int getBidPrice() {
      return bidPrice;
   }

   public void setBidPrice(int bidPrice) {
      this.bidPrice = bidPrice;
   }

   public String getBidTime() {
      return bidTime;
   }

   public void setBidTime(String bidTime) {
      this.bidTime = bidTime;
   }
   
   
   
}