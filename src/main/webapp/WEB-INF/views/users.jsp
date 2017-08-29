<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
   String path = request.getContextPath();
   request.setAttribute("path", path);
%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<style type="text/css">
   table{
      border: 1px solid red;
   }
   tr{
      text-align: center;
      height: 30px; line-height: 30px;
   }
   th{
      border: 1px solid red;
      width: 200px;
   }
   td{
      border: 1px solid red;
      width: 200px;
   }
   a{
     text-decoration: none;
   }
</style>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3><a href="${path}/user/add">添加</a></h3>
<form action="select" method="post">
	<table>
	  <tr>
	     <td></td>
	     <td colspan="2">
	                         查询条件:<input type="text" name="sel"/>&nbsp;
	        <input type="submit" value="查询"/>
	     </td>
	     <td></td>
	  </tr>
	  <tr>
	    <th>ID</th>
	    <th>姓名</th>
	    <th>年龄</th>
	    <th>操作</th>
	  </tr>
	  <c:forEach items="${list}" var="user">
	     <tr>
		     <td>${user.id}</td>
		     <td>${user.userName}</td>
		     <td>${user.age}</td>
		     <td><a href="${path}/user/${user.id}/delete">删除</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<a href="${path}/user/${user.id}/update">修改</a></td>
	     </tr>
	  </c:forEach>
	</table>
</form>
</body>
</html>