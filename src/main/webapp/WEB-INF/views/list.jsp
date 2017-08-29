<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
   String path = request.getContextPath();
   request.setAttribute("path", path);
%>  
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="${path}/static/js/jquery-3.2.1.js"></script>
<script type="text/javascript">
    
</script>
</head>
<body>
	<form action="login" method="post">
		<input name="userName" type="text"/>
		<input name="password" type="text"/>
		<input type="submit" value="提交"/> 
	</form>
</body>
</html>