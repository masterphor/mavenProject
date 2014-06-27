<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<form name="inputprofile" method="get" action="textInput.jsp">
		<table border="1">

			<tr>
			    <td>First Name : <input type="text" name="txtFirstName"></td>
			</tr>
			<tr>
				<td>Last Name : <input type="text" name="txtLastName"></td>
			</tr>
			<tr>
				<td>Email : <input type="email" name="txtEmail"></td>
			</tr>
			<tr>
				<td>Tel : <input type="tel" name="txtTel"></td>		
			<tr>
			    <td>&nbsp;<input type="submit" name="submit" value="Submit"></td>
		    </tr>			
		</table>
	</form>
	
</body>
</html>