package Controller;

import java.sql.ResultSet;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import DAO.IM.memberDao;
import model.member;

public class loginAction extends ActionSupport {
	private String user;
	private String password;
	
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
	
	public String execute() throws Exception{
		
		//if(getUser().equals("aaa")&& getPassword().equals("123"))
			
		//if(new memberDao().checkUser(getUser(), getPassword()))
		
		//if(new memberDao().checkUser2(getUser(), getPassword())!=null)
		
		ResultSet rs=new memberDao().checkUser2(getUser(), getPassword());
		if(rs!=null)
		{
			member m=new member(rs.getString("name"),rs.getString("user"),rs.getString("password"),rs.getString("tel"));
			Map session=ActionContext.getContext().getSession();
			
			session.put("M", m);
		
			return SUCCESS;
			//return "yes";
			
		}
		else 
		{
			return ERROR;
			//return "no";
		}
			
	}
	
}
