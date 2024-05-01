<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" errorPage="error.jsp" %>
<%@ page import="java.util.List" %>
<%@ page import="com.javapro.assignment.domain.Customer" %>
<!DOCTYPE html>
<html>
<head>
  <title>고객 정보 표</title>
  <style>
    table, th, td {
      border: 1px solid black;
      border-collapse: collapse;
    }
    th, td {
      padding: 8px;
      text-align: left;
    }
  </style>
</head>
<body>

<h2>고객 정보</h2>
<table>
  <thead>
  <tr>
    <th>custid</th>
    <th>name</th>
    <th>address</th>
    <th>phone</th>
  </tr>
  </thead>
  <tbody>
  <c:forEach var="data" items="${list}">
    <tr>
      <td>${data.custid }</td>
      <td>${data.name }</td>
      <td>${data.address }</td>
      <td>${data.phone }</td>
    </tr>
  </c:forEach>
  </tbody>
</table>
<ul>
  <li><a href="/">메인 페이지</a></li>
</ul>

</body>
</html>
