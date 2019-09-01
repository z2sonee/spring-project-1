package phoenix.jpetstore.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.SessionStatus;

import phoenix.jpetstore.dao.AccountDao;
import phoenix.jpetstore.domain.Account;

@Controller
@RequestMapping("/signon")
public class SignOnController {
	@Autowired AccountDao accountDao;
	
	@RequestMapping(method = RequestMethod.GET)
	public String form() {
		return "jsp/SignOnForm";
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String userLogin(Account account, Model model,
			HttpSession session, HttpServletResponse response) throws Exception {
		int result = accountDao.loginCheck(account);
		model.addAttribute("result", result);
		model.addAttribute("account", account);
		
		if(result == 1) {
			model.addAttribute("loginId", account.getLoginId());
			model.addAttribute("password", account.getPassword());
			session.setAttribute("loginId", account.getLoginId());
			session.setAttribute("password", account.getPassword());
			System.out.println(session.getAttribute("loginId"));
			System.out.println(session.getAttribute("password"));
			return "redirect:/";
		}
		else {
			response.setContentType("text/html; charset=utf-8");
			PrintWriter out = response.getWriter();
			
			out.println("<script>");
			out.println("alert('아이디 또는 비밀번호를 잘못 입력하셨습니다.');");
			out.println("history.back();");
			out.println("</script>");
			out.close();
			
			return null;
		}
	}
	
	@RequestMapping("/logout")
	public String userLogout (SessionStatus status, 
			HttpSession session, HttpServletResponse response) throws IOException {
		session.removeAttribute("loginId");
		session.removeAttribute("password");
		
		System.out.println(session.getAttribute("loginId"));
		System.out.println(session.getAttribute("password"));
		
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		
		out.println("<script>");
		out.println("alert('Logout이 되었습니다.');");
		out.println("history.back();");
		out.println("</script>");
		out.close();
		return "redirect:/";
	}
	
	
}
