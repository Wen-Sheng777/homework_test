<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="css/st1.css" rel="stylesheet" type="text/css">
</head>
<body>
	<table width=600 align=center border=1>
		<tr id="head">
			<td height=150 align=center><jsp:include page="head.jsp" />
		<tr class="content">
			<td height=300 align=center>
				<table width=300 align=center>
					<tr>
						<td>
						0.<a href="administrator/Alogin.jsp">管理員登入</a>
					<tr>
						<td>
						1.<a href="member/login.jsp">會員登入</a>
				</table>
		<tr class="end">
			<td height=100 align=center><jsp:include page="end.jsp" />
	</table>
	
</body>
</html>