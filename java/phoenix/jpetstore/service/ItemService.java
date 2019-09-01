package phoenix.jpetstore.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import phoenix.jpetstore.dao.mybatis.MyBatisItemDao;
import phoenix.jpetstore.domain.Item;
@Service
public class ItemService {
	@Autowired private MyBatisItemDao myBatis;
	
	//private int nextItemId = 3;
	
	//itemDetail(해당 아이템 출력) 
	public Item selectItemByItemId(int itemId) {
		return myBatis.selectItemByItemId(itemId);
	}
	
	
	//itemList 출력
	public List<Item> getItems() {
		return myBatis.getItems();
	} 
	
	
	//검색 기능
	public List<Item> selectItemByKeyword(String keyword) {
		System.out.println("keyword=" + keyword);
		return myBatis.selectItemByKeyword(keyword);
	}
	
	
	public void insertItem(int itemId, String itemPrice, String itemName, String itemPic, String itemInfo,
			String itemBidEndTime, int catId) {
		//itemId = "i" + nextItemId;
		//nextItemId++;
		System.out.println("itemService의 insertItem");
		
		myBatis.insertItem(itemId, itemPrice, itemName, itemPic, itemInfo, itemBidEndTime, catId);
	}
	
	public void deleteItem(int itemId) {
		myBatis.deleteItem(itemId);
	}
	

}
