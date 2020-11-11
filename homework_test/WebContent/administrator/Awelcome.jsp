<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="model.member"
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
				<table width=300 align=center>
					<tr>
						<td colspan=2 align=center ><%=m.getName() %> 歡迎進入管理員操作介面
					<hr>
					<tr height=30>
						<td colspan=2 align=center >
						<a href="update.jsp">修改會員資料</a>
					<tr height=30>
						<td colspan=2 align=center >
						<a href="delete.jsp">刪除會員資料</a>
					<tr height=30>
						<td colspan=2 align=center >
						<a href="updateOrder.jsp">修改會員訂單</a>
					<tr height=30>
						<td colspan=2 align=center >
						<a href="deleteOrder.jsp">刪除會員訂單</a>
					<tr height=30>
						<td colspan=2 align=center >
						<a href="../index.jsp">回首頁</a>
				</table>
		<tr class="end">
			<td height=100 align=center><jsp:include page="../end.jsp"/>
	
	
	</table>
</body>

</html>