<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Profile</title>
</head>
<body>
 <%
 	response.setHeader("Cache-Control", "private,no-store,no-cache");
 	//response.setHeader("Cashe-Control", "no-cache, no-store, must-revalidate");
 	response.setHeader("Pragma", "no-cache");
 	response.setHeader("Expires", "0");
 	
 	
 	if (session.getAttribute("user")==null){
		System.out.println("no session found");
		response.sendRedirect("login.jsp");
	} else {
		System.out.println("session is:" + session.getAttribute("user"));
	}


%>
<h2>Home Page</h2>
<script>
alert('hello')</script>
<form action="logout">
	<input type="submit" value="Logout">
</form>

</body>
</html>