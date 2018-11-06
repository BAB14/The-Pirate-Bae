<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<html>
<head>
<meta charset="ISO-8859-1">

<title>Testing</title>

</head>

    <style>
        body{
            background-color: rgb(120, 160, 60);
        }
    </style>
    
    <body>
    
	    <form method = "post" action = "inserTest.jsp">
	        Testing insert<br />
	        
	        First name
	        <input type = "text" name = "fName" /><br />
	        
	        Last name
	        <input type = "text" name = "lName" /><br />
	        
	        <p><input type = "submit" name = "Submit" value = "Submit Credentials" />	        
	        <input type = "reset" value = "Clear" /></p>
	        
		</form>
    </body>
</html>