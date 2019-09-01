package phoenix.jpetstore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import phoenix.jpetstore.domain.Bid;
import phoenix.jpetstore.service.BidService;
import phoenix.jpetstore.service.BidServiceImpl;

@Controller
public class BidController {
   
   @Autowired BidService bidService;
   
   @RequestMapping("/bidList/{itemId}")
   public String bidList(@PathVariable int itemId, Model model) {
      
      List<Bid> bidList = bidService.getBidList(itemId);
      System.out.println(bidList);
      model.addAttribute("bidList", bidList);
      model.addAttribute("itemId", itemId);
      return "jsp/itemDetail.jsp";
   }
   
   public void setBidService(BidServiceImpl bidService) {
      this.bidService = bidService;
   }
   
   
}