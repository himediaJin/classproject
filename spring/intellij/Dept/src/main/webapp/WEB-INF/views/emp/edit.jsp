<%--
  Created by IntelliJ IDEA.
  User: cheoho-hi
  Date: 2022-11-24
  Time: 오후 2:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

  <h1>사원 등록</h1>
  <hr>
<form method="post">

  <table>
    <tr>
      <td>사원 번호</td>
      <td><input type="number" name="empno" value="${emp.empno}" readonly></td>
    </tr>
    <tr>
      <td>사원이름</td>
      <td><input type="text" name="ename" value="${emp.ename}"></td>
    </tr>
    <tr>
      <td>직급</td>
      <td><input type="text" name="job" value="${emp.job}"></td>
    </tr>
    <tr>
      <td>메니져</td>
      <td>
          <select name="mgr">
            <c:forEach items="${empList}" var="emplist">
            <option value="${emplist.empno}" ${emplist.empno eq emp.mgr}>${emplist.ename}</option>
            </c:forEach>
          </select>
      </td>
    </tr>
    <tr>
      <td>입사일</td>
      <td><input type="date" name="hiredate" value="${emp.hiredate}"></td>
    </tr>
    <tr>
      <td>급여</td>
      <td><input type="number" name="sal" value="${emp.sal}"></td>
    </tr>
    <tr>
      <td>보너스</td>
      <td><input type="number" name="comm" value="${emp.comm}"></td>
    </tr>
    <tr>
      <td>부서번호</td>
      <td>
        <select name="deptno">
          <c:forEach items="${deptList}" var="deptlist">
            <option value="${deptlist.deptno}" ${deptlist.deptno eq emp.deptno} >${deptlist.dname}</option>
          </c:forEach>
        </select>
      </td>
    </tr>
    <tr>
      <td></td>
      <td><input type="submit" value="등록"></td>
    </tr>
  </table>

</form>

</body>
</html>
