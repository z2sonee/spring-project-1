package phoenix.jpetstore.controller;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;

import phoenix.jpetstore.domain.Review;
import phoenix.jpetstore.service.PetStoreFacade;

@Controller
@SessionAttributes("review")
@RequestMapping("/DeleteReviewForm/{reviewId}")
public class DeleteReviewController {
   private static final String DELETE_REVIEW_FORM = "jsp/DeleteReviewForm";
   private static final String REVIEW_NOT_FOUND_VIEW = "jsp/ReviewNotFound";
   
   @Autowired
   private PetStoreFacade petStore;
   
   @ModelAttribute("reviewDelReq")
   public ReviewDelRequest formBacking(HttpServletRequest request) {
      return new ReviewDelRequest();
   }
   
   @RequestMapping(method = RequestMethod.GET)
   public String form() {
      return DELETE_REVIEW_FORM;
   }
   
   @RequestMapping(method = RequestMethod.POST)
   public String delete(HttpServletRequest request,
         @PathVariable("reviewId") int reviewId,
         @ModelAttribute("reviewDelReq") ReviewDelRequest reviewDelReq, HttpSession session,
         HttpServletResponse response) throws Exception {
      if(reviewDelReq == null)
         return REVIEW_NOT_FOUND_VIEW;
         
      String password = (String) session.getAttribute("password");
      
      System.out.println(reviewDelReq.getPassword());
      if(reviewDelReq.getPassword().equals(password)) {
    	  petStore.deleteReview(reviewId);
    	  return "jsp/ReviewDeleted";
      }
      else {
			response.setContentType("text/html; charset=utf-8");
			PrintWriter out = response.getWriter();
			
			out.println("<script>");
			out.println("alert('비밀번호가 일치하지 않아 삭제할 수 없습니다.');");
			out.println("history.back();");
			out.println("</script>");
			out.close();
			
			return null;
		}
   }
//   
//   
}