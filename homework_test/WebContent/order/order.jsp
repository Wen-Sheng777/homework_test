<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="model.member"%>
    
    <%@taglib prefix="s" uri="/struts-tags" %>
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
			<td height=300 align=center>
			
				<form action="confirm.jsp" method="post">
				<table width=400 align=center>
					<tr>
						<td>姓名:
						<td><input type="text" name="name"value="<%=m.getName() %>" readonly="ture"/>
					<tr>
						<td>尺: 20元
						<td><input type="text" name="ruler">
				
					<tr>
						<td>筆: 15元
						<td><input type="text" name="pen">
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