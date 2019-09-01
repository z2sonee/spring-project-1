package phoenix.jpetstore.controller;

import java.util.Date;


import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.multipart.MultipartFile;

public class ItemRegistRequest {
	
	private String itemPrice;
	private String itemName;
	//private String itemPic;
	private String itemInfo;
	private MultipartFile itemPic;
	private String itemBidEndTime;
	
	public String getItemPrice() {
		return itemPrice;
	}
	public void setItemPrice(String itemPrice) {
		this.itemPrice = itemPrice;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	
	 
	public MultipartFile getItemPic() {
		return itemPic;
	}
	public void setItemPic(MultipartFile itemPic) {
		this.itemPic = itemPic;
	}
	
	public String getItemInfo() {
		return itemInfo;
	}
	public void setItemInfo(String itemInfo) {
		this.itemInfo = itemInfo;
	}
	
	public String getItemBidEndTime() {
		return itemBidEndTime;
	}
	public void setItemBidEndTime(String itemBidEndTime) {
		this.itemBidEndTime = itemBidEndTime;
	}
	
	@Override
	public String toString() {
		return "ItemRegistRequest [itemPrice=" + itemPrice + ", itemName=" + itemName + ", itemPic=" + itemPic
				+ ", itemInfo=" + itemInfo + ", itemBidEndTime=" + itemBidEndTime + "]";
	}
	
	
}
