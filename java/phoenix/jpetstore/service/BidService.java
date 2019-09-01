package phoenix.jpetstore.service;

import java.util.Date;
import java.util.List;
import phoenix.jpetstore.domain.Bid;

//@WebService(name = "BidService")
public interface BidService {
   List<Bid> getBidList(int itemId);
   void updateBidPrice(Bid bid);
   void insertBid(int itemId, int userId, int BidPrice, String bidRegistTime);
   String getBidEndTime(int itemId);
   int getBidUserId(int userId);
   int getBidId(int userId);
}