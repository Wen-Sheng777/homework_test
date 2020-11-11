package Controller;


import DAO.IM.memberDao;
import DAO.IM.orderDao;
import model.member;
import model.porder;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionSupport;

public class finishAction extends ActionSupport {
	
	
	   public String execute() throws Exception{

//		   HttpServletRequest request = ServletActionContext.getRequest();
//		   HttpServletResponse response = ServletActionContext.getResponse();
//		   HttpSession session=request.getSession();
//	
//			porder p=(porder)session.getAttribute("P");
//			new orderDao().add(p);
//			response.sendRedirect("finish.jsp");
//	    	return SUCCESS;
		   
		   HttpServletRequest request = ServletActionContext.getRequest();
		   HttpServletResponse response = ServletActionContext.getResponse();
		   request.setCharacterEncoding("UTF-8");
		   HttpSession session=request.getSession();
		   porder p=(porder)session.getAttribute("P");
		  
		   new orderDao().add(p);
		   
		   response.sendRedirect("finish.jsp");
		   return SUCCESS;
	    }

}
