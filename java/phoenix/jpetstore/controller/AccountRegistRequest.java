package phoenix.jpetstore.controller;

public class AccountRegistRequest {
	   private int userId;
	   private String loginId;
	   private String userName;
	   private String password;
	   private String email;
	   private String address;
	   private String grade;
	   private String phone;
	   private int point;
	
	   public int getUserId() {
		   return userId;
	   }
	   public void setUserId(int userId) {
		   this.userId = userId;
	   }
	   public String getLoginId() {
		   return loginId;
	   }
	   public void setLoginId(String loginId) {
		   this.loginId = loginId;
	   }
	   public String getUserName() {
		   return userName;
	   }
	   public void setUserName(String userName) {
		   this.userName = userName;
	   }
	   public String getPassword() {
		   return password;
	   }
	   public void setPassword(String password) {
		   this.password = password;
	   }
	   public String getEmail() {
		   return email;
	   }
	   public void setEmail(String email) {
		   this.email = email;
	   }
	   public String getAddress() {
		   return address;
	   }
	   public void setAddress(String address) {
		   this.address = address;
	   }
	   public String getGrade() {
		   return grade;
	   }
	   public void setGrade(String grade) {
		   this.grade = grade;
	   }
	   public String getPhone() {
		   return phone;
	   }
	   public void setPhone(String phone) {
		   this.phone = phone;
	   }
	   public int getPoint() {
		   return point;
	   }
	   public void setPoint(int point) {
		   this.point = point;
	   }
}
