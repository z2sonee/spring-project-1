package phoenix.jpetstore.dao.mybatis.mapper;

import org.springframework.dao.DataAccessException;

import phoenix.jpetstore.domain.Account;

public interface AccountMapper {
	void insert(int userId, String email, String userName, String address, String phone, String grade, int point, String loginId, String password) throws DataAccessException;
	int loginCheck(Account account) throws DataAccessException;
}
