<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Submited Page</title>
</head>
<body>
Name : <%= request.getParameter("name") %><br>
Gender : <%= request.getParameter("gender") %><br>
Language : 
<%
String [] languages = request.getParameterValues("language");
if(languages != null){
for(String lang : languages){
	out.println(lang);
}
}else{
	out.println("No language is selected");
}
%>
<br>
Country : <%= request.getParameter("country") %><br> 
</body>
</html>