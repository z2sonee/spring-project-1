package phoenix.jpetstore.dao.mybatis.mapper;

import java.util.Date;
import java.util.List;
import java.util.Map;

import phoenix.jpetstore.domain.Bid;
import phoenix.jpetstore.domain.Item;

public interface BidMapper {
   
   List<Bid> getBidList(int itemId);
   void updateBidPrice(Bid bid);
   //Bid insertBid(Bid bid);
   void insertBid(int itemId, int userId, int BidPrice, String bidRegistTime);
   String getBidEndTime(int itemId);
   int getBidUserId(int userId);
   int getBidId(int userId);
   
}