package model;

public class loginpojo 
{
	private String username,password;

	public loginpojo() {
		super();
		// TODO Auto-generated constructor stub
	}

	public loginpojo(String username, String password) {
		super();
		this.username = username;
		this.password = password;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
}
