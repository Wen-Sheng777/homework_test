package model;

public class member {
	private String name;
	private String user;
	private String password;
	private String tel;
	
	public member() {
		
	}
	public member(String name,String user,String password,String tel) {
		
		this.name=name;
		this.user=user;
		this.password=password;
		this.tel=tel;
		
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name=name;
	}
	
	public String getUser(){
		return user;
	}
	public void setUser(String user) {
		this.user=user;
	}
	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password=password;
	}
	
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel=tel;
	}

}
