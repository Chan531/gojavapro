<%@ page contentType="text/html;charset=UTF-8" language="java"  pageEncoding="utf-8" %>
<%@ page isErrorPage="true" %>
<!DOCTYPE html>
<html>
<head>
  <title>Error Page</title>
</head>
<body>
<h2>예기치 못한 에러가 발생했습니다.</h2>
<p>에러 메시지: <%= exception.getMessage() %></p>
</body>
</html>
