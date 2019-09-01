package phoenix.jpetstore.dao.mybatis.mapper;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;

import phoenix.jpetstore.domain.Item;

public interface ItemMapper {
	@Select({"SELECT item_info As itemInfo, item_pic As itemPic, item_name As itemName, item_price As itemPrice, item_id As itemId " +
			"FROM item " +
			"WHERE item_id = #{itemId}"})
	Item selectItemByItemId(int itemId);
	
	@Select({"SELECT item_info As itemInfo, item_name As itemName, item_price As itemPrice, item_id As itemId " +
			"FROM item"})
	List<Item> getItems();
	
	@Select({"SELECT item_bid_end_time As itemBidEndTime,"
			+ " item_info As itemInfo, item_pic As itemPic,"
			+ " item_name As itemName, item_price As itemPrice,"
			+ " item_id As itemId "
			+ "FROM item "
			+ "WHERE item_name = #{keyword}"})
	List<Item> selectItemByKeyword(String keyword);
	
	//@SelectKey(statement="SELECT Author_seq.nextval AS itemId FROM DUAL", keyProperty="itemId", resultType=int.class, before=true)
	//@Insert("INSERT INTO item(item_id, item_price, item_name, item_pic, item_info, item_bid_end_time, cat_id) VALUES (item_seq.nextval, itemPrice, itemName, itemPic, itemInfo, itemBidEndTime, catId)")
	@Insert("INSERT INTO item(item_id, item_price, item_name, item_pic, item_info, item_bid_end_time, cat_id) VALUES (item_seq.nextval, #{param2}, #{param3}, #{param4}, #{param5}, #{param6}, #{param7})")
	void insertItem(int itemId, String itemPrice, String itemName, String itemPic, String itemInfo,
			String itemBidEndTime, int catId);
	
	@Delete("DELETE FROM item WHERE item_id = #{itemId}")
	void deleteItem(int itemId);
}

