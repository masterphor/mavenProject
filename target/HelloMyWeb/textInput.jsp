<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<%
	String stxtFirstName=request.getParameter("txtFirstName");
	String stxtLastName=request.getParameter("txtLastName");
	String stxtEmail=request.getParameter("txtEmail");
	String stxtTel=request.getParameter("txtTel");
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	Value of input FirstName : <%=stxtFirstName%><br>
	Value of input LastName : <%=stxtLastName%><br>
	Value of input Email : <%=stxtEmail%><br>
	Value of input Tel : <%=stxtTel%><br>
</body>
</html>