<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
    import="model.member"
    import="model.porder"
    import="java.text.DateFormat"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="../css/st1.css" rel="stylesheet" type="text/css">
</head>
<%
member m=(member)session.getAttribute("M");
int r=Integer.parseInt(request.getParameter("ruler"));
int pen=Integer.parseInt(request.getParameter("pen"));
porder p=new porder(m.getName(),r,pen); 
p.setDate(DateFormat.getDateTimeInstance(2,2).format(System.currentTimeMillis()));
session.setAttribute("P",p);
%>
<body>
<table width=600 align=center border=1>
		<tr id="head">
			<td height=150 align=center><jsp:include page="../head.jsp"/>
		<tr class="content">
			<td height=300 align=center>
			
				<table width=300 align=center border=1>
					<tr>
						<td colspan=2 align=center><%=p.getName() %>你的訂單細目
					<tr>
						<td width=50 align=center>尺
						<td width=250 align=center><%=p.getRuler() %>
					<tr>
						<td width=50 align=center>筆
						<td width=250 align=center><%=p.getPen() %>
					<tr>
						<td colspan=2 align=center>共<%=p.getSum() %>元
					<tr>
						<td colspan=2 align=center><a href="finishAction">確定訂購</a>		
				</table>
				
		<tr class="end">
			<td height=100 align=center><jsp:include page="../end.jsp"/>
	
	
	</table>
	

</body>
</html>