<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Form Demo</title>
</head>
<body>
<form action="<%=request.getContextPath()%>/Controller" method="post">
Full name :  <input type="text" name="name" required="required"/><br><br>
Gender : 	<input type="radio" name="gender" value="Male" checked="checked">Male<br>
			<input type="radio" name="gender" value="Female">Female<br><br>
Language : 	<input type="checkbox" name="language" value="English" >English<br>
			<input type="checkbox" name="language" value="Sinhala">Sinhala<br>
			<input type="checkbox" name="language" value="Tamil">Tamil<br><br>
			
Country : 	<select name="country">
			<option value="Srilanka">Sri Lanka</option>
			<option value="US">US</option>
			<option value="UK">UK</option>
			</select>
			
<input type="submit" value="submit">








</form>
</body>
</html>