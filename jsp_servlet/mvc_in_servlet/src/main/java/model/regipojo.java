package model;

public class regipojo 
{
	private String name,email,password,gender,country;
	private long phno;
	
	
	public regipojo() {
		super();
		// TODO Auto-generated constructor stub
	}


	public regipojo(String name, String email, String password, String gender, String country, long phno) {
		super();
		this.name = name;
		this.email = email;
		this.password = password;
		this.gender = gender;
		this.country = country;
		this.phno = phno;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}


	public long getPhno() {
		return phno;
	}


	public void setPhno(long phno) {
		this.phno = phno;
	}
	
	
	
}
