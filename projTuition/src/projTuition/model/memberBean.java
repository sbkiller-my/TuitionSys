package projTuition.model;


public class memberBean {
	//setter and getter using generate in properties
	String username;
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
	String password;
	
	String firstname;
	public String getFirst() {
		return firstname;
	}
	public void setFirst(String firstname) {
		this.firstname = firstname;
	}
	public String getLast() {
		return lastname;
	}
	public void setLast(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	String lastname;
	String email;
}
