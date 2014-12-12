<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Fibonacci Request</title>
</head>
<body>
Job number is :<%=request.getAttribute("jobnum") %> <br>
      Fib seq= <%=request.getAttribute("result")%>
	  <%response.addHeader("refresh","10;http://localhost:8080/FibProject/FibServerlet?Input=poll&fib="+request.getAttribute("result")); %>
  	  This Page will Refresh in 10 seconds
</form>
</body>
</html>