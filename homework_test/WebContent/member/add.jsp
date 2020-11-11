<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
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
			<td height=300 align=center >
			<form action="add" method="post">
				<table width=300 align=center>
					<tr>
						<td colspan=2 align=center >註冊會員
					<tr>
						<td width=50 align=center>姓名
						<td width=250 align=center><input type="text" name="name">
					<tr>
						<td width=50 align=center>帳號
						<td width=250 align=center><input type="text" name="user">
					<tr>
						<td width=50 align=center>密碼
						<td width=250 align=center><input type="password" name="password">
					<tr>
						<td width=50 align=center>電話
						<td width=250 align=center><input type="text" name="tel">
						
					<tr>
						<td colspan=2 align=center>
						<input type="submit" value="ok">
				</table>
				</form>
		<tr class="end">
			<td height=100 align=center><jsp:include page="../end.jsp"/>
	
	
	</table>
</body>
</html>