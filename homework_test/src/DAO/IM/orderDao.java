package DAO.IM;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import DAO.daoim;
import DbConn.Conn;
import model.porder;

public class orderDao implements daoim {

	public static void main(String[]args) {
//		porder p =new porder("a",1,1);
//		new orderDao().add(p);
		
//		member m1=new member("aaa","ttt","1233","1223344");
//		ResultSet rs=new orderDao().query(m1.getName());
//		
//		try {
//			while(rs.next())
//			{
//				System.out.println(rs.getInt("id")+" "+
//								   rs.getString("name")+" "+
//								   rs.getInt("ruler")+" "+
//								   rs.getInt("pen")+" "+
//								   rs.getInt("sum"));
//			}
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
//		porder p1=new porder("test",100,100);
//		new orderDao().update(9, p1);
		
//		new orderDao().delete(8);
	}

	
	@Override
	public void add(Object o) {
		porder p=(porder) o;
		String sql="insert into porder(name,ruler,pen,sum,date) values(?,?,?,?,?)";
		Connection conn=Conn.Conn();
		try {
			PreparedStatement ps=conn.prepareStatement(sql);
			ps.setString(1, p.getName());
			ps.setInt(2, p.getRuler());
			ps.setInt(3, p.getPen());
			ps.setInt(4, p.getSum());
			ps.setString(5, p.getDate());
			ps.executeUpdate();
			
			
		}catch(SQLException e) {
			System.out.println("no ");
			e.printStackTrace();
			
		}
		
		
		
		
		
		
	}
	
	public ResultSet query(String name) {
		String sql="select * from porder where name='"+name+"'";
		Connection conn;
		ResultSet rs=null;
		try {
				conn=Conn.Conn();
				PreparedStatement ps=conn.prepareStatement(sql);
				rs=ps.executeQuery();
				
				return rs;

		}
		catch(SQLException e)
		{
			e.printStackTrace();
			return null;
		}
		
	}
	
	@Override
	public ResultSet queryAll() {
		String sql="select * from porder";
		Connection conn;
		ResultSet rs=null;
		try {
				conn=Conn.Conn();
				PreparedStatement ps=conn.prepareStatement(sql);
				rs=ps.executeQuery();
				
				return rs;

		}
		catch(SQLException e)
		{
			e.printStackTrace();
			return null;
		}
		
	}

	@Override
	public void update(int id, Object o) {
		porder p=(porder)o;
		
		String sql="update porder set name='"+p.getName()+"', ruler='"+p.getRuler()+"'"
				+ ", pen='"+p.getPen()+"',sum='"+p.getSum()+"'where id="+id;
		
		Connection conn=Conn.Conn();
		try {
				PreparedStatement ps=conn.prepareStatement(sql);
				
				ps.executeUpdate();
			
		}catch(SQLException e) {
			System.out.println("no ");
			e.printStackTrace();
		}
	}

	@Override
	public void delete(int id) {
		Connection conn=Conn.Conn();
		String sql="delete from cc.porder where id="+id;
		
		try {
			PreparedStatement ps=conn.prepareStatement(sql);
			
			ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	

}
