<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="model.member"
    import="DAO.IM.orderDao"
    import="java.sql.*"
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="../css/st1.css" rel="stylesheet" type="text/css">
</head>
<%
	member m=(member)session.getAttribute("M");
%>
<body>
	<table width=600 align=center border=1>
		<tr id="head">
			<td height=150 align=center><jsp:include page="../head.jsp"/>
		<tr class="content">
			<td height=300 align=center valign=top>
			<form action="deleteOrder" method="post">
					<table width=50% align=center>
						<tr>
						刪除會員訂單
						<tr align=center>
							<td colspan=3 align=center>
							id <input type="text" name="id" size="5">
						<tr align=center>
							<td colspan=3 align=center>
							 <input type="submit" value="delete">		
					</table>
			</form>
			
			<hr>
			
				<%
						ResultSet rs=new orderDao().queryAll();
				
				out.println("<table width=600 align=center border=1>");
				
				out.println("<tr align=center><td>ID<td>名字<td>尺<td>筆<td>總價<td>日期");
				
				while(rs.next())
				{
					out.println("<tr align=center><td>"+rs.getInt("id")+
									"<td>"+rs.getString("name")+
									"<td>"+rs.getInt("ruler")+
									"<td>"+rs.getInt("pen")+
									"<td>"+rs.getInt("sum")+
									"<td>"+rs.getString("date"));
				}
				
				out.println("</table>");
				
				%>
			<a href="Awelcome.jsp">回上層</a>
		<tr class="end">
			<td height=100 align=center><jsp:include page="../end.jsp"/>
	
	
	</table>
</body>

</html>