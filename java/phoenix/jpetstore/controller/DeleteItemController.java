package phoenix.jpetstore.controller;



import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import phoenix.jpetstore.dao.mybatis.MyBatisItemDao;
import phoenix.jpetstore.domain.Bid;
import phoenix.jpetstore.service.BidService;
import phoenix.jpetstore.service.ItemService;
import phoenix.jpetstore.validator.DeleteRegisterValidator;

@Controller
@RequestMapping("/deleteItem/{itemId}")
public class DeleteItemController {
	private static final String ITEM_DELETE_FORM = "jsp/DeleteItemForm";
	@Autowired private ItemService itemService;
	@Autowired private BidService bidService;

	public void setItemService(ItemService itemService) {
		this.itemService = itemService;
	}
	
	@ModelAttribute("deleteRegReq")// request handler methods 보다 먼저 호출됨
	public DeleteRegistRequest formBacking(HttpServletRequest request, HttpServletResponse response,
			@PathVariable("itemId") int itemId) throws IOException {
		
		List<Bid> bid = bidService.getBidList(itemId);
		
		System.out.println(bid);

		if (bid.size() != 0) {
			response.setContentType("text/html; charset=UTF-8");
	    	PrintWriter out = response.getWriter();
	    	out.println("<script>alert('입찰하려는 사용자가 있어 삭제할 수 없습니다.'); history.go(-1);</script>");
	    	out.flush(); 
		}
		
		return new DeleteRegistRequest();
	}
	
	@RequestMapping(method = RequestMethod.GET) 
	public String form() { 
		return ITEM_DELETE_FORM;
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String delete(HttpServletRequest request,
			@PathVariable("itemId") int itemId,
			@ModelAttribute("deleteRegReq") DeleteRegistRequest deleteRegReq,
			BindingResult bindingResult,
			HttpSession session, HttpServletResponse response) throws Exception {	
		System.out.println("Delete Item command 객체: " + deleteRegReq);
		
		new DeleteRegisterValidator().validate(deleteRegReq, bindingResult);
		
		if (bindingResult.hasErrors()) {
			return ITEM_DELETE_FORM;
		}
		
		String password = (String)session.getAttribute("password");
		if (deleteRegReq.getCurrentPassword().equals(password) && deleteRegReq.isAgreement() == true) {
			itemService.deleteItem(itemId);
			return "jsp/itemDeleted";
		}
		
		else {
			response.setContentType("text/html; charset=utf-8");
			PrintWriter out = response.getWriter();
			
			out.println("<script>");
			out.println("alert('삭제할 수 없습니다.');");
			out.println("history.back();");
			out.println("</script>");
			out.close();
			
			return null;
		}
		
	}
}