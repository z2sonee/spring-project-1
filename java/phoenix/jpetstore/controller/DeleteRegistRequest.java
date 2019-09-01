package phoenix.jpetstore.controller;
//아이템 삭제
public class DeleteRegistRequest {
	private String currentPassword;
	private boolean agreement;

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
	@Override
	public String toString() {
		return "DeleteRegistRequest [currentPassword=" + currentPassword + ", agreement=" + agreement + "]";
	}
	
}
