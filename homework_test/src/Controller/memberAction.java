package Controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DAO.IM.memberDao;
import model.member;

@WebServlet("/memberAction")
public class memberAction extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public memberAction() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//System.out.println("hi");
		
		String NAME=request.getParameter("name");
		String USER=request.getParameter("user");
		String PASSWORD=request.getParameter("password");
		String TEL=request.getParameter("tel");
		
		member m1=new member(NAME,USER,PASSWORD,TEL);
		
		new memberDao().add(m1);
		
		response.sendRedirect("member/ok.jsp");
		
	}

}
