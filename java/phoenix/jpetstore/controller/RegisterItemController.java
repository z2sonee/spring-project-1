package phoenix.jpetstore.controller;

import java.io.File;
import java.io.IOException;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.multipart.MultipartFile;

import phoenix.jpetstore.dao.mybatis.MyBatisItemDao;
import phoenix.jpetstore.domain.Item;
import phoenix.jpetstore.service.ItemService;
import phoenix.jpetstore.validator.ItemRegisterValidator;

@Controller
@RequestMapping("/registItem")
public class RegisterItemController {
	private static final String ITEM_REGISTRATION_FORM = "jsp/registItem";
	@Autowired private ItemService itemService;
	private WebApplicationContext context;	
	private String uploadDir;

	public void setApplicationContext(ApplicationContext appContext)
			throws BeansException {
			this.context = (WebApplicationContext) appContext;
			this.uploadDir = context.getServletContext().getRealPath("/tomcatImage/");
		}
	
	public void setItemService(ItemService itemService) {
		this.itemService = itemService;
	}
	
	 @ModelAttribute("itemRegReq")
	 public ItemRegistRequest formBacking(HttpServletRequest request) {
		 return new ItemRegistRequest();
	 }

	@RequestMapping(method = RequestMethod.GET)
	public String form() {
		return ITEM_REGISTRATION_FORM;
	}
	
	@RequestMapping(method = RequestMethod.POST)
	public String register(@ModelAttribute("itemRegReq") ItemRegistRequest itemRegReq,
			BindingResult bindingResult) {
		System.out.println("Register Item command 객체: " + itemRegReq);
		
		MultipartFile itemPic = itemRegReq.getItemPic();
		uploadFile(itemPic);
		System.out.println(itemPic);

		new ItemRegisterValidator().validate(itemRegReq, bindingResult);
		if (bindingResult.hasErrors()) {
			return ITEM_REGISTRATION_FORM;
		}
		
		String itemPath = itemPic.getOriginalFilename();
		itemService.insertItem(1, itemRegReq.getItemPrice(), itemRegReq.getItemName(), itemPath/*itemRegReq.getItemPic().getOriginalFilename()*/,
				itemRegReq.getItemInfo(), itemRegReq.getItemBidEndTime(), 1);

		return "jsp/itemRegistered";
	}
	
	private void uploadFile(MultipartFile itemPic) {
		System.out.println("업로드 한 파일: "
				+ itemPic.getOriginalFilename());
		File file = new File(this.uploadDir + itemPic.getOriginalFilename());
		try {
			itemPic.transferTo(file);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
