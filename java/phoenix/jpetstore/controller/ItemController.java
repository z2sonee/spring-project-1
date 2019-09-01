package phoenix.jpetstore.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import phoenix.jpetstore.domain.Bid;
import phoenix.jpetstore.domain.Item;
import phoenix.jpetstore.service.BidService;
import phoenix.jpetstore.service.ItemService;

@Controller
public class ItemController {
	@Autowired private ItemService itemService;
	@Autowired private BidService bidService;
	
	@RequestMapping("/itemList")
	public String itemList(Model model) {
		try {
			List<Item> items = itemService.getItems();
			
			model.addAttribute("items", items);
			return "jsp/itemList";
		} catch(IndexOutOfBoundsException i) {
			System.out.println(i);
		} 
		return "jsp/itemRegistered";
	}
	
	@RequestMapping("/itemList/{itemId}")
	public String itemDetail(@PathVariable("itemId") int itemId, Model model,
			HttpServletResponse response) throws IOException {
		Item item = itemService.selectItemByItemId(itemId);
		List<Bid> bidList = bidService.getBidList(itemId);
		if (item == null) {
			return "jsp/itemNotFound";
		}
	  
		model.addAttribute("item", item);
		model.addAttribute("bidList", bidList);
		return "jsp/itemDetail";
	}
	
	
	@RequestMapping("/itemList/keyword")
	public String searchItem(HttpServletRequest request, Model model) throws IOException {
		String keyword = request.getParameter("keyword");
		List<Item> searchItem = itemService.selectItemByKeyword(keyword);
		model.addAttribute("searchItem", searchItem);
		System.out.println(searchItem);
		return "jsp/SearchItem";
	}
	
	public void setItemService(ItemService itemService) {
		this.itemService = itemService;
	}

	
}
