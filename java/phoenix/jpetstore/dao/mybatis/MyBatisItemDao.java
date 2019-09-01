package phoenix.jpetstore.dao.mybatis;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import phoenix.jpetstore.dao.ItemDao;
import phoenix.jpetstore.dao.mybatis.mapper.ItemMapper;
import phoenix.jpetstore.domain.Item;

@Repository
public class MyBatisItemDao implements ItemDao {
	@Autowired 
	private ItemMapper itemMapper;

	public Item selectItemByItemId(int itemId) throws DataAccessException {
		return itemMapper.selectItemByItemId(itemId);
		//return sqlSession.getMapper(ItemMapper.class).selectItemByItemId(itemId);
	}
	
	public List<Item> getItems() throws DataAccessException {
		return itemMapper.getItems();
		//return sqlSession.getMapper(ItemMapper.class).getItems();
	}
	
	public List<Item> selectItemByKeyword(String keyword) throws DataAccessException{
		return itemMapper.selectItemByKeyword(keyword);
		//return sqlSession.getMapper(ItemMapper.class).selectItemByKeyword(keyword);
	}
	
	/*
	public void insertItem(String itemId, String itemPrice, String itemName, String itemPic, String itemInfo,
			Date itemBidEndTime, String catId) throws DataAccessException {
		System.out.println("MyBatisItemDao의 insertItem");
		itemMapper.insertItem(itemId, itemPrice, itemName, itemPic, itemInfo, itemBidEndTime, catId);
	}
	*/
	
	public void insertItem(int itemId, String itemPrice, String itemName, String itemPic, String itemInfo,
			String itemBidEndTime, int catId) throws DataAccessException {
		itemMapper.insertItem(itemId, itemPrice, itemName, itemPic, itemInfo, itemBidEndTime, catId);
	}
	
	public void deleteItem(int itemId) throws DataAccessException {
		itemMapper.deleteItem(itemId);
	}
	
}
