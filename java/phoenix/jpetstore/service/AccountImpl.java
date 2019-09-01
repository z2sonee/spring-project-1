package phoenix.jpetstore.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import phoenix.jpetstore.dao.AccountDao;
import phoenix.jpetstore.domain.Account;

@Service
@Repository
@Transactional
public class AccountImpl implements AccountFacade {
	@Autowired private AccountDao accountDao;
	
	@Override
	public int loginCheck(Account account) {
		// TODO Auto-generated method stub
		return accountDao.loginCheck(account);
	}

	@Override
	public void insert(int userId, String email, String userName, String address, String phone, String grade, int point, String loginId, String password) {
		// TODO Auto-generated method stub
		accountDao.insert(userId, email, userName, address, phone, grade, point, loginId, password);
		
	}

}
