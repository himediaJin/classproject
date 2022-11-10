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
    <title>Todo Register</title>
    <style>
        body {
            line-height: 250%;
        }
    </style>
</head>
<body>
<h1>Todo Read</h1>


    할일 <input type="text" name="todo" id="todo" value="저장되어 있는 할일" readonly><br>
    마감 <input type="date" name="date" id="date" value="2022-11-10" readonly> <br>

    <a href="/todo/modify?tno=${param.tno}">modify</a>
    <form action="/todo/remove" method="post">
        <input hidden name="tno" value="${param.tno}"> <input type="submit" value="삭제">
    <%--    <a href="/todo/remove?tno=${param.tno}">remove</a>--%>
    </form>
    <a href="/todo/list"> Todo List</a>


</body>
</html>
