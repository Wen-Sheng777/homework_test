package Controller;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

import DAO.IM.memberDao;
import model.member;

public class update extends ActionSupport {
	private int id;
	private String name;
	private String user;
	private String password;
	private String tel;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	
	public String execute() throws Exception
	{
		member m=new member();
		m.setName(getName());
		m.setUser(getUser());
		m.setPassword(getPassword());
		m.setTel(getTel());
		
		new memberDao().update(getId(), m);

		
		return "update";
	
	}
	

}
