package phoenix.jpetstore.dao.mybatis;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import phoenix.jpetstore.dao.mybatis.mapper.BidMapper;

import phoenix.jpetstore.domain.Bid;
import phoenix.jpetstore.domain.Item;
import phoenix.jpetstore.service.BidService;

@Repository
public class MyBatisBidDao {
   
   @Autowired
   private BidMapper bidMapper;

   //private BidService bidService;
   
   public List<Bid> getBidList(int itemId) throws DataAccessException {
      return bidMapper.getBidList(itemId);
   }
   
   public void updateBidPrice(Bid bid) throws DataAccessException {
      int updateBidPrice = bid.getBidPrice();
      int bidId = bid.getBidId();
      
      Date date = new Date();
      SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd");
      String updateBidRegistTime = sdf.format(date);
      
      Bid updateBid = new Bid(bidId, updateBidRegistTime, updateBidPrice);
      Map<Integer, Bid> param = new HashMap<Integer, Bid>();
      param.put(bidId, updateBid);
   }
   
   public void insertBid(int itemId, int userId, int BidPrice, String bidRegistTime) throws DataAccessException {
      bidMapper.insertBid(itemId, userId, BidPrice, bidRegistTime);
   }
   
   public String getBidEndTime(int itemId) throws DataAccessException {
      return bidMapper.getBidEndTime(itemId);
   }
   
   public int getBidUserId(int userId) throws DataAccessException {
      return bidMapper.getBidUserId(userId);
   }
   
   public int getBidId(int userId) throws DataAccessException {
      return bidMapper.getBidId(userId);
   }
}