package DAO.IM;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import DAO.daoim;

import DbConn.Conn;
import model.member;


public class memberDao implements daoim {
	
	public static void main(String[] args) {
//		member m1=new member("BB","BB","1122","12345678");
//		new memberDao().add(m1);
		member m1=new member("tt","ttt","1233","1223344");
		new memberDao().update(7, m1);
	}

	@Override
	public void add(Object o) {
		String sql="insert into member(name,user,password,tel) value(?,?,?,?)";
		member m=(member)o;
		
		Connection conn=Conn.Conn();
		
		try {
			PreparedStatement ps=conn.prepareStatement(sql);
			
			ps.setString(1, m.getName());
			ps.setString(2, m.getUser());
			ps.setString(3, m.getPassword());
			ps.setString(4, m.getTel());
			
			ps.executeUpdate();
			
		} catch(Exception e) {
			System.out.println("no ");
			e.printStackTrace();
		}
		
	}
	
	@Override
	public ResultSet queryAll() {
		String sql="select * from member";
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
	
	public boolean checkUser(String user,String password) {
		
		String sql="select * from member where user='"+user+"' and password='"+password+"'";
		Connection conn;
		ResultSet rs=null;
		
		conn=Conn.Conn();
		try {
				conn=Conn.Conn();
				PreparedStatement ps=conn.prepareStatement(sql);
				rs=ps.executeQuery();
				
				if(rs.next()) {
					return true;
				}
				else
				{
					return false;
				}
			
			}
			catch(SQLException e)
			{
				e.printStackTrace();
				return false;
			}
		
		
	}
	
	public ResultSet checkUser2(String user,String password) {
		
		String sql="select * from member where user='"+user+"' and password='"+password+"' ";
		Connection conn;
		ResultSet rs=null;
		
		conn=Conn.Conn();
		try {
			conn=Conn.Conn();
			
			PreparedStatement ps=conn.prepareStatement(sql);
			rs=ps.executeQuery();
			
			if(rs.next()) {
				
				return rs;
				
			}else {
				
				return null;
				
			}
			
			//return rs;
			
			
		}catch(SQLException e) {
			
			e.printStackTrace();
			return null;
			
		}
		
		
		
	}

	@Override
	public void update(int id, Object o) {
		member m=(member)o;
		
		String sql="update member set name='"+m.getName()+"', user='"+m.getUser()+"'"
				+ ", password='"+m.getPassword()+"', tel='"+m.getTel()+"'where id="+id;
		
		Connection conn=Conn.Conn();
		try {
				PreparedStatement ps=conn.prepareStatement(sql);
				
				ps.executeUpdate();
			
		}catch(SQLException e) {
			System.out.println("no ");
			e.printStackTrace();
		}
	}
	
	public static void updateName(int id,String name) {
		String sql="update member set name='"+name+"' where id="+id;
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
		String sql="delete from cart2.member where id="+id;
		
		try {
			PreparedStatement ps=conn.prepareStatement(sql);
			
			ps.executeUpdate();
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	

}
