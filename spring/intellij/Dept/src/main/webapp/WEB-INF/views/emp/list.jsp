<%--
  Created by IntelliJ IDEA.
  User: cheoho-hi
  Date: 2022-11-24
  Time: 오후 12:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

  <h1>Emp LIST</h1>
  <hr>

  <a href="/emp/register">사원 등록</a>   <a href="/dept/list">부서 리스트</a>

    <table border="1">
        <tr>
            <th>사원번호</th>
            <th>사원이름</th>
            <th>직급</th>
            <th>관리자</th>
            <th>입사일</th>
            <th>급여</th>
            <th>보너스</th>
            <th>부서번호</th>
            <th>관리</th>
        </tr>

        <c:forEach items="${empList}" var="emp">
        <tr>
            <td>${emp.empno}</td>
            <td>${emp.ename}</td>
            <td>${emp.job}</td>
            <td>${emp.mgr}</td>
            <td>${emp.hiredate}</td>
            <td>${emp.sal}</td>
            <td>${emp.comm}</td>
            <td>${emp.deptno}</td>
            <td> <a href="/list/edit?no=${emp.empno}">수정</a> / <a onclick="deleteDept(${emp.empno});" style="cursor: pointer">삭제</a> </td>
        </tr>
        </c:forEach>

    </table>

<script>
    function deleteDept(no){
        if(confirm("삭제하시겠습니까?")){
            location.href = '/dept/delete?deptno='+no;
        }
    }
</script>


</body>
</html>
