<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="model.member"
    import="DAO.IM.memberDao"
    import="java.sql.*"
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="../css/st1.css" rel="stylesheet" type="text/css">
</head>
<body>
	<table width=600 align=center border=1>
		<tr id="head">
			<td height=150 align=center><jsp:include page="../head.jsp"/>
		<tr class="content">
			<td height=300 align=center valign=top>
			<form action="delete" method="post">
					<table width=600 align=center>
						<tr>
						刪除會員資料
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
						ResultSet rs=new memberDao().queryAll();
				
				out.println("<table width=600 align=center border=1>");
				
				out.println("<tr align=center><td>ID<td>名字<td>使用者<td>密碼<td>電話");
				
				while(rs.next())
				{
					out.println("<tr align=center><td>"+rs.getInt("id")+
									"<td>"+rs.getString("name")+
									"<td>"+rs.getString("user")+
									"<td>"+rs.getString("password")+
									"<td>"+rs.getString("tel"));
				}
				
				out.println("</table>");
				
				%>
			<a href="Awelcome.jsp">回上層</a>
		<tr class="end">
			<td height=100 align=center><jsp:include page="../end.jsp"/>
	
	
	</table>
</body>

</html>