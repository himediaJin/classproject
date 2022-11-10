<%--
  Created by IntelliJ IDEA.
  User: cheoho-hi
  Date: 2022-11-10
  Time: 오후 2:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Todo List</title>
</head>
<body>
<h1>Tdo List</h1>

<ul>
  <c:forEach var="num" begin="1" end="10">
      <li> <a href="/todo/read?tno=${num}">${num}</a> Todo 제목 2022-11-10 done</li>
  </c:forEach>
</ul>

<a href="/todo/register"> ToDo 등록 </a>

</body>
</html>
