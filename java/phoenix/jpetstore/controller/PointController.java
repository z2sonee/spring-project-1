package phoenix.jpetstore.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.SessionAttributes;

import phoenix.jpetstore.domain.Account;
import phoenix.jpetstore.domain.ViewPoint;
import phoenix.jpetstore.service.PetStoreFacade;

@Controller
@SessionAttributes("point")
public class PointController {
   
   private PetStoreFacade petStore;
   
   @Autowired
   public void setPetStore(PetStoreFacade petStore) {
      this.petStore = petStore;
   }
   @RequestMapping("/ViewPoint")
   public String getPointList(HttpServletRequest request, HttpSession session, Model model) {
     String loginId = (String) session.getAttribute("loginId");
     int userId = petStore.findUserId(loginId);
     
     System.out.println(loginId + "(로그인시 아이디) " + userId + "(사용자의 아이디)");
     
     
     Account account = petStore.getAccount(userId);
     model.addAttribute("account", account);
     
     System.out.println(account.getUserId() + "유저아이디 맞나?");
     
      List<ViewPoint> pointList = petStore.getPointList(userId);
      model.addAttribute("pointList", pointList);
      
      
      System.out.print("테스트");
      return "jsp/MyPoint";
   }
   
}