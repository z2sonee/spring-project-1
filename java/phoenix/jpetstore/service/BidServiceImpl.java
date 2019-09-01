package phoenix.jpetstore.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import phoenix.jpetstore.dao.mybatis.MyBatisBidDao;
import phoenix.jpetstore.domain.Bid;

@Service
public class BidServiceImpl implements BidService{

   @Autowired
   private MyBatisBidDao bidDao;
   
   @Override
   public List<Bid> getBidList(int itemId) {
      return bidDao.getBidList(itemId);
   }

   @Override
   public void insertBid(int itemId, int userId, int BidPrice, String bidRegistTime) {
      bidDao.insertBid(itemId, userId, BidPrice, bidRegistTime);
   }

   @Override
   public String getBidEndTime(int itemId) {
      return bidDao.getBidEndTime(itemId);
   }

   @Override
   public void updateBidPrice(Bid bid) {
      bidDao.updateBidPrice(bid);
   }

   @Override
   public int getBidUserId(int userId) {
      // TODO Auto-generated method stub
      return bidDao.getBidUserId(userId);
   }

   @Override
   public int getBidId(int userId) {
      // TODO Auto-generated method stub
      return bidDao.getBidId(userId);
   }
}