package phoenix.jpetstore.controller;

import phoenix.jpetstore.domain.Account;

public class DeleteItemForm {
	private String currentPassword;
	private boolean agreement;
	
	public DeleteItemForm() {
	}
	
	public String getCurrentPassword() {
		return currentPassword;
	}

	public void setCurrentPassword(String currentPassword) {
		this.currentPassword = currentPassword;
	}

	public boolean isAgreement() {
		return agreement;
	}

	public void setAgreement(boolean agreement) {
		this.agreement = agreement;
	}

	public boolean checkAgreement() {
		if (isAgreement() == true)
			return true;
		else
			return false;
		
	}
}
