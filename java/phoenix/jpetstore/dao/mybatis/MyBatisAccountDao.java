package phoenix.jpetstore.dao.mybatis;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import phoenix.jpetstore.dao.AccountDao;
import phoenix.jpetstore.dao.mybatis.mapper.AccountMapper;
import phoenix.jpetstore.domain.Account;

@Repository
public class MyBatisAccountDao implements AccountDao{

	@Autowired private AccountMapper accountMapper;
	
	public int loginCheck(Account account) throws DataAccessException {
		return accountMapper.loginCheck(account);
	}
	
	public void insert(int userId, String email, String userName, String address, String phone, String grade, int point, String loginId, String password) throws DataAccessException {
		accountMapper.insert(userId, email, userName, address, phone, grade, point, loginId, password);
	}
}