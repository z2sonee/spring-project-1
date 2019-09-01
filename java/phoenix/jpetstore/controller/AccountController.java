package phoenix.jpetstore.controller;

import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import phoenix.jpetstore.dao.AccountDao;
import phoenix.jpetstore.domain.Account;
import phoenix.jpetstore.service.AccountFacade;
import phoenix.jpetstore.service.PetStoreFacade;
import phoenix.jpetstore.validator.ReviewRegisterValidator;

@Controller
@RequestMapping("/join")
public class AccountController {
	
	@Autowired private AccountFacade accFacade;
	  
	
	@ModelAttribute("accountRegReq")
	 public AccountRegistRequest formBacking(HttpServletRequest request) {
		 return new AccountRegistRequest();
	 }
	
	@RequestMapping(method = RequestMethod.GET)
	public String form() {
		return "jsp/MemberRegisterForm";
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String userJoin(@ModelAttribute("accountRegReq") AccountRegistRequest accountRegReq, Model model) {
		
		int userId = 1;
		String email = accountRegReq.getEmail();
		String userName = accountRegReq.getUserName();
		String address = accountRegReq.getAddress();
		String phone = accountRegReq.getPhone();
		String grade = accountRegReq.getGrade();
		int point = accountRegReq.getPoint();
		String loginId = accountRegReq.getLoginId();
		String password = accountRegReq.getPassword();
		
		accFacade.insert(userId, email, userName, address, phone, grade, point, loginId, password);
		return "jsp/JoinRegistered";
	}	

}
