package phoenix.jpetstore.controller;

import java.io.Serializable;

import phoenix.jpetstore.domain.Account;

@SuppressWarnings("serial")
public class UserSession implements Serializable {

	private Account account;

	public UserSession(Account account) {
		this.account = account;
	}

	public Account getAccount() {
		return account;
	}

}