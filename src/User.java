
public class User {
	
	private String userName;
	private String lastName;
	private String accountNumber;
	
	public User() {
		
	}
	public User(String userName, String lastName, String accountNumber) {
		this.userName = userName;
		this.lastName = lastName;
		this.accountNumber = accountNumber;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}

	
	public void printUserInfo() {	
		System.out.println("---------------------");
		System.out.println("Kullanıcı adı:" + userName);
		System.out.println("Kullanıcı soyadı:" + lastName);
		System.out.println("Hesap numarası:" + accountNumber);
		System.out.println();

	}
}
