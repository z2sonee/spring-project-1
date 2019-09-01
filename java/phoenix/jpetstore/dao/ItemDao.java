package phoenix.jpetstore.dao;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.dao.DataAccessException;

import phoenix.jpetstore.domain.Item;

public interface ItemDao {
	List<Item> getItems() throws DataAccessException;
	
	Item selectItemByItemId(int itemId) throws DataAccessException;
	
	List<Item> selectItemByKeyword(String keyword) throws DataAccessException;
	
	public void insertItem(int itemId, String itemPrice, String itemName, String itemPic, String itemInfo,
			String itemBidEndTime, int catId) throws DataAccessException;
	
	public void deleteItem(int itemId) throws DataAccessException;
}
