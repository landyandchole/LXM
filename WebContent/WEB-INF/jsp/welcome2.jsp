<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>welcome</title>
</head>
<body>
<form action="${msg}.do" method="post">
	<table id="table">
		<tr>
			<td><input type="text" id="text" name="text" value="<%=request.getParameter("text")%>"></td>
			<td><input type="submit" id="submit" name="submit" value="submit"></td>
		</tr>
		<tr><td>${message2}</td></tr>
		<tr><td>${message3}</td></tr>
		<tr><td>${message4}</td></tr>
	</table>
</form>


</body>
</html>