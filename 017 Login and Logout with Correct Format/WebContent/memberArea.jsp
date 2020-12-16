<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Member Area</title>
</head>
<body>
	<%
		String username = null, sessionID = null;
	//Checking the invalid login by url
	if(request.getSession().getAttribute("username")==null){
		response.sendRedirect(request.getContextPath()+"/SiteController?action=login");
	} else{
		username = request.getSession().getAttribute("username").toString();
		sessionID = request.getSession().getId();
	}

	//Checking the invalid login by url

	%>
	User name :
	<%=username%><br> Session ID :
	<%=sessionID%>
	
	<!-- Log out  -->
	<form action="<%= request.getContextPath()%>/MemberAreaController" method="get">
	<input type="hidden" name="action" value="destroy">
	<input type="submit" value="Logout">
	</form>
	
</body>
</html>