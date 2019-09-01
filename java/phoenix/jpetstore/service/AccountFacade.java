package phoenix.jpetstore.service;

import phoenix.jpetstore.domain.Account;

public interface AccountFacade {

	void insert(int userId, String email, String userName, String address, String phone, String grade, int point, String loginId, String password);
	   
	int loginCheck(Account account);
}
