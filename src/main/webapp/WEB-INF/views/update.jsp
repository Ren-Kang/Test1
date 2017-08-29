<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
   String path = request.getContextPath();
   request.setAttribute("path", path);
%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
   <form action="update1" method="post">
                      姓名:<input type="text" name="userName" value="${user.userName}"/><br/>
                      密码:<input type="text" name="password" value="${user.password}"/><br/>
                      年龄:<input type="text" name="age" value="${user.age}"/><br/>
       <input type="submit" value="提交"/><br/>
   </form>
</body>
</html>