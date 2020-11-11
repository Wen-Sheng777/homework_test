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
						<td colspan=2 align=center ><%=m.getName() %> 歡迎
				
					<tr height=50>
						<td colspan=2 align=center >
						1.<a href="../order/order.jsp">進入購物</a>
					<tr>
						<td colspan=2 align=center >
						2.<a href="../order/queryOrder.jsp">查詢訂單</a>
					<tr height=150>
						<td colspan=2 align=center >
						<a href="../index.jsp">回首頁</a>
				</table>
		<tr class="end">
			<td height=100 align=center><jsp:include page="../end.jsp"/>
	
	
	</table>
</body>

</html>