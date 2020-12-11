<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="user" class="org.crazycoder.beans.User" scope="session"></jsp:useBean>
<form action="getSessionProperty.jsp">

First Name :  <input type="text" name="firstName" required="required" value='<jsp:getProperty property="firstName" name="user"/>'/><br>
Last Name :  <input type="text" name="lastName" required="required" value='<jsp:getProperty property="lastName" name="user"/>'/><br><br>


			
<input type="submit" value="submit">

</form>





</body>
</html>