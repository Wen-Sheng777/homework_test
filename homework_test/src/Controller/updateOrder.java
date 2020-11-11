package Controller;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

import DAO.IM.orderDao;
import model.porder;

public class updateOrder extends ActionSupport {
	private int id;
	private String name;
	private int ruler;
	private int pen;
	private int sum;
	
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
	
	public int getRuler() {
		return ruler;
	}
	public void setRuler(int ruler) {
		this.ruler = ruler;
	}
	public int getPen() {
		return pen;
	}
	public void setPen(int pen) {
		this.pen = pen;
	}
	public int getSum() {
		return sum;
	}
	public void setSum(int sum) {
		this.sum = sum;
	}
	public String execute() throws Exception
	{
		porder p=new porder();
		p.setName(getName());
		p.setRuler(getRuler());
		p.setPen(getPen());
		
		new orderDao().update(getId(), p);

		
		return "updateOrder";
	
	}
	

}
