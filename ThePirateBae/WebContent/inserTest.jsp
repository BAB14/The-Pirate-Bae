<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>User inserted</title>
	</head>
	
    <style>
        body{
            background-color: rgb(120, 160, 60);
        }
    </style>
    
    <%@ page import = "piratePackage.Testingclass" %>
    
	<%
	String name1 = request.getParameter("fName").toString();
	String name2 = request.getParameter("lName").toString();
	Testingclass userTest = new Testingclass(name1, name2);
	%>
	
	<body>
		<p><%= userTest.fName %></p>
	</body>

</html>