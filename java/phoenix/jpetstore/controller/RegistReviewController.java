package phoenix.jpetstore.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.util.WebUtils;

import phoenix.jpetstore.domain.Account;
import phoenix.jpetstore.domain.Review;
import phoenix.jpetstore.service.PetStoreFacade;
import phoenix.jpetstore.validator.ReviewRegisterValidator;



@Controller
@SessionAttributes("sessionAccount")
@RequestMapping("/WriteReviewForm")
public class RegistReviewController {
   private static final String REVIEW_REGISTRATION_FORM = "jsp/WriteReviewForm";
   
   private PetStoreFacade petStore;
   
   @Autowired
   public void setPetStore(PetStoreFacade petStore) {
      this.petStore = petStore;
   }
   
   @ModelAttribute("reviewRegReq")
   public ReviewRegistRequest formBacking(HttpServletRequest request) {
      System.out.println(request.getParameter("userId"));
      return new ReviewRegistRequest();
      
   }
   @RequestMapping(method = RequestMethod.GET)
   public String form() {
      return REVIEW_REGISTRATION_FORM;
   }
   
   @RequestMapping(method = RequestMethod.POST)
   public String register(@ModelAttribute("reviewRegReq") ReviewRegistRequest reviewRegReq,
         BindingResult bindingResult, HttpServletRequest request, HttpSession session, Model model) {   
      
      new ReviewRegisterValidator().validate(reviewRegReq, bindingResult);
      if (bindingResult.hasErrors()) {
         return REVIEW_REGISTRATION_FORM;
      }
      
      int reviewId = 1;
      String loginId = (String) session.getAttribute("loginId");
      int userId = petStore.findUserId(loginId);
      
      String reviewTitle = reviewRegReq.getReviewTitle();
      String reviewContent = reviewRegReq.getReviewContent();
      String reviewItemName = reviewRegReq.getReviewItemName();
      String reviewItemPrice = reviewRegReq.getReviewItemPrice();
      
      petStore.insertReview(reviewId, reviewTitle, reviewContent, userId, reviewItemName, reviewItemPrice);

      /*포인트 추가 부분*/
     
      
      int pointNum = 1;
      String pointInfo = "리뷰 작성으로  50 포인트가 적립되었습니다.";
      
      int point = petStore.getPointFromAccount(userId);
      System.out.println("포인트는 " + point + "점 입니다!");
      point += 50;
      System.out.println(point);
      
      petStore.insertPointInfo(pointNum, userId, pointInfo, point);
      
      petStore.updateAccountPoint(userId, point);
 
       int totalPoint = point;
        
       System.out.println(totalPoint);
        
       petStore.updateTotalPoint(userId, totalPoint);
      
      return "jsp/ReviewRegistered";
      
   }
     
}
