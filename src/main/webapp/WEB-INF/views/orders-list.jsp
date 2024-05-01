<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8" errorPage="error.jsp" %>
<%@ page import="java.util.List" %>
<%@ page import="com.javapro.assignment.domain.Orders" %>
<!DOCTYPE html>
<html>
<head>
    <title>주문 정보 표</title>
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

<h2>주문 정보</h2>
<table>
    <thead>
    <tr>
        <th>orderid</th>
        <th>custid</th>
        <th>bookid</th>
        <th>orderdate</th>
        <th>saleprice</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="data" items="${list}">
        <tr>
            <td>${data.orderid }</td>
            <td>${data.custid }</td>
            <td>${data.bookid }</td>
            <td>${data.orderdate }</td>
            <td>${data.saleprice }</td>
        </tr>
    </c:forEach>
    </tbody>
</table>

<ul>
    <li><a href="/">메인 페이지</a></li>
</ul>
</body>
</html>
