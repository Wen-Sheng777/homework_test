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
			查詢訂單
			<hr>
				<%
						ResultSet rs=new orderDao().query(m.getName());
				
				out.println("<table width=600 align=center border=1>");
				
				out.println("<tr align=center><td>ID<td>名字<td>尺<td>筆<td>總和<td>日期");
				
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
				<a href="../member/welcome.jsp">回上層</a>
		<tr class="end">
			<td height=100 align=center><jsp:include page="../end.jsp"/>
	
	
	</table>
</body>
</html>