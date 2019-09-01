package phoenix.jpetstore.domain;

import java.io.Serializable;
import java.util.Date;

public class Bid implements Serializable{
   private int bidId;
   private String bidTime;
   private int bidPrice;
   private Account account;
   private Item item;
   
   public int getBidId() {
      return bidId;
   }
   public void setBidId(int bidId) {
      this.bidId = bidId;
   }
   public String getBidTime() {
      return bidTime;
   }
   public void setBidTime(String bidTime) {
      this.bidTime = bidTime;
   }
   public int getBidPrice() {
      return bidPrice;
   }
   public void setBidPrice(int bidPrice) {
      this.bidPrice = bidPrice;
   }
   public Account getAccount() {
      return account;
   }
   public void setAccount(Account account) {
      this.account = account;
   }
   public Item getItem() {
      return item;
   }
   public void setItem(Item item) {
      this.item = item;
   }
   @Override
   public String toString() {
      return "Bid [bidId=" + bidId + ", bidTime=" + bidTime + ", bidPrice=" + bidPrice + "]";
   }
   public Bid(int bidId, String bidTime, int bidPrice, Account account, Item item) {
      this.bidId = bidId;
      this.bidTime = bidTime;
      this.bidPrice = bidPrice;
      this.account = account;
      this.item = item;
   }
   public Bid(int bidId, String bidTime, int bidPrice) {
      this.bidId = bidId;
      this.bidTime = bidTime;
      this.bidPrice = bidPrice;
   }
   public Bid() {
      super();
   }
   
}
   