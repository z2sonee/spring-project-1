package phoenix.jpetstore.controller;


import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.util.WebUtils;

import phoenix.jpetstore.domain.Review;
import phoenix.jpetstore.service.PetStoreFacade;


@Controller
@SessionAttributes("review")
public class ReviewController {
   
   private PetStoreFacade petStore;
   
   @Autowired
   public void setPetStore(PetStoreFacade petStore) {
      this.petStore = petStore;
   }
   
   @RequestMapping("/ReviewBoard")
   public String getReviewList(Model model) {
      List<Review> reviews = petStore.getReviewList();
      model.addAttribute("reviews", reviews);
      System.out.print(reviews);
      return "jsp/ReviewBoard";
   }
   
   @RequestMapping("/ReviewBoard/{reviewId}")
   public String reviewDetail(@PathVariable int reviewId, Model model) {
      Review review = petStore.getReviewsByReviewId(reviewId);
      if (review == null) {
         return "jsp/ReviewNotFound";
      }
      model.addAttribute("review", review);
      return "jsp/ReviewDetail";
   }
}
   
   