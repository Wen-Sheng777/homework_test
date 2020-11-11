package Controller;

import com.opensymphony.xwork2.ActionSupport;

import DAO.IM.memberDao;

public class delete extends ActionSupport{
	private int id;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	
	public String execute() throws Exception
	{
		new memberDao().delete(getId());
		
		return "delete";
	}
	

}