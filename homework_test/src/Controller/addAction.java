package Controller;

import com.opensymphony.xwork2.ActionSupport;

import DAO.IM.memberDao;
import model.member;

public class addAction extends ActionSupport {
	
	private String name;
	private String user;
	private String password;
	private String tel;
	
    public String getName() {
    	return name;
    }
    public void setName(String name) {
    	this.name=name;
    }
    
    public String getUser() {
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
    
    public String execute() throws Exception{
    	
    	member m=new member(getName(),getUser(),getPassword(),getTel());
    	
    	new memberDao().add(m);
    	
    	return SUCCESS;
    	
    }

}
