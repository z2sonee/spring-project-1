package phoenix.jpetstore.domain;

import java.util.Date;

import org.springframework.web.multipart.MultipartFile;

public class Item {
	private int itemId;
	private String itemPrice;
	private String itemName;
	private MultipartFile itemPic;
	//private String itemPic;
	private String itemInfo;
	private String itemBidEndTime;
	
	public Item() {
	}
	
	public Item(int itemId, String itemPrice, String itemName, MultipartFile itemPic/*String itemPic*/, String itemInfo, String itemBidEndTime) {
		this.itemId = itemId;
		this.itemPrice = itemPrice;
		this.itemName = itemName;
		this.itemPic = itemPic;
		this.itemInfo = itemInfo;
		this.itemBidEndTime = itemBidEndTime;
	}
	
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
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
	
	/*
	public String getItemPic() {
		return itemPic;
	}
	public void setItemPic(String itemPic) {
		this.itemPic = itemPic;
	}
	*/
	
	public String getItemInfo() {
		return itemInfo;
	}
	
	
	public MultipartFile getItemPic() {
		return itemPic;
	}
	
	public void setItemPic(MultipartFile itemPic) {
		this.itemPic = itemPic;
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
	
	
	/*
	public Date getItemBidEndTime() {
		return itemBidEndTime;
	}
	public void setItemBidEndTime(Date itemBidEndTime) {
		this.itemBidEndTime = itemBidEndTime;
	}
	*/
	
}
