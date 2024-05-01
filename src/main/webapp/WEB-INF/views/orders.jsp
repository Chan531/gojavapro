<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!doctype html>
<html lang="ko">
<head>
    <meta charset="UTF-8">
    <title>주문 추가 페이지</title>
</head>
<body>
<h1>주문 추가 페이지입니다!</h1>
<form name="f1" action="./orders" method="post">
    <input type="number" name="orderid" width="12" size="10">
    <input type="number" name="custid" width="12" size="10">
    <input type="number" name="bookid" width="12" size="10">
    <input type="date" name="orderdate" width="12" size="10">
    <input type="number" name="saleprice" width="12" size="10">
    <div></div><input type="submit" value="저장" name="B1">
</form>
<ul>
    <li><a href="/orders/list">주문 정보 조회 페이지</a></li>
    <li><a href="/">메인 페이지</a></li>
</ul>
</body>
</html>
