package phoenix.jpetstore.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import phoenix.jpetstore.domain.Bid;
import phoenix.jpetstore.domain.Item;
import phoenix.jpetstore.service.BidService;
import phoenix.jpetstore.service.BidServiceImpl;
import phoenix.jpetstore.validator.BidRegisterValidator;

@Controller
@RequestMapping("/bidForm/{itemId}")
@SessionAttributes("itemBidEndTime")
public class BidRegisterController {
   
   private static final String BID_REGISTRATION_FORM = "jsp/bidForm";
   
   @Autowired
   private BidService bidService;
   
   public boolean compareDate(String bidTime, String bidEndTime) {
	      int year1 = Integer.parseInt(bidTime.split("-")[0]);
	      int year2 = Integer.parseInt(bidEndTime.split("-")[0]);
	      int month1 = Integer.parseInt(bidTime.split("-")[1]);
	      int month2 = Integer.parseInt(bidEndTime.split("-")[1]);
	      int day1 = Integer.parseInt(bidTime.split("-")[1]);
	      int day2 = Integer.parseInt(bidEndTime.split("-")[1]);
	      
	      if(year1 < year2) return true;
	      else if(year1 == year2 && month1 < month2) return true;
	      else if(year1 == year2 && month1 == month2 && day1 < day2) return true;
	      else return false;
	      
	}
   
   @ModelAttribute("bidRegReq")
   public BidRegistRequest formBacking(HttpServletRequest request, HttpServletResponse response,
		   @PathVariable("itemId") int itemId) throws IOException {
	   Date date = new Date();
	    SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-d");
	    String bidTime = sdf.format(date);
	    String bidEndTime = bidService.getBidEndTime(itemId);
	      
	    System.out.println(bidTime);
	    System.out.println(bidEndTime);
	    if(!compareDate(bidTime, bidEndTime)) {  //입찰시간이 itemBidEndTime이전일때만 입찰 가능
	         response.setContentType("text/html; charset=UTF-8");
	    	 PrintWriter out = response.getWriter();
	    	 out.println("<script>alert('입찰 기한이 지나 경매에 참여할 수 없습니다.'); history.go(-1);</script>");
	    	 out.flush(); 
	       }
      return new BidRegistRequest();
   }
   
   @RequestMapping(method = RequestMethod.GET)
   public String form() {
      return BID_REGISTRATION_FORM;
   }
   
  
   @RequestMapping(method = RequestMethod.POST)
   public String register(@ModelAttribute("bidRegReq") BidRegistRequest bidRegReq,
		   @PathVariable("itemId") int itemId,
         BindingResult bindingResult, Model model) {
      System.out.println("bid command 객체: " + bidRegReq);
      
      new BidRegisterValidator().validate(bidRegReq, bindingResult);
      if(bindingResult.hasErrors()) {
         return BID_REGISTRATION_FORM; 
      }
      int userId = 1;//Session에 저장된 userId 받아오기
      int bidPrice = bidRegReq.getBidPrice();
      
      Date date = new Date();
      SimpleDateFormat sdf = new SimpleDateFormat("YYYY-MM-d");
      String bidTime = sdf.format(date);
      String bidEndTime = bidService.getBidEndTime(itemId);
      
      System.out.println(bidTime);
      System.out.println(bidEndTime);
      if(compareDate(bidTime, bidEndTime)) {  //입찰시간이 itemBidEndTime이전일때만 입찰 가능
      
      bidService.insertBid(itemId, userId, bidPrice, bidTime);

      List<Bid> bidList = bidService.getBidList(itemId);
      model.addAttribute("bidList", bidList);
       }
     
      return "jsp/bidConfirm";
   }
   
   public void setBidService(BidServiceImpl bidService) {
      this.bidService = bidService;
   }
   

}