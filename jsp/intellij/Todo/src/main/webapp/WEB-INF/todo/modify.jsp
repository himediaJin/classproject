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
<h1>Todo Modify</h1>

<form method="post">
    할일 <input type="text" name="todo" id="todo" value="저장되어 있는 제목" placeholder="할일 제목을 입력하세요!"> <br>
    마감 <input type="date" name="date" id="date" value="2022-11-10"> <br>
    <input type="reset"> <input type="submit" value="수정">
</form>

</body>
</html>
