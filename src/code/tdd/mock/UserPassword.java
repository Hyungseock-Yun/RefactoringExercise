package code.tdd.mock;

public class UserPassword {
	
	private String userid;
	private String password;

	public void savePassword(String userId, String password) {
		this.userid = userId;
		this.password = password;
		
	}

	public String getPassword(String userId) {
		
		if (userId.equals(this.userid))
			return password;
		else
			return "";
	}

}
