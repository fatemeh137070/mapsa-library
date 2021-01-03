<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: sara
  Date: 10/26/2020
  Time: 5:18 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
<c:if test="${msg ne null}"
> ${msg}</c:if>
<form action="/insertbook" method="post">
    bookName:<input type="text" name="bookName"><br>
    isbn:<input type="text" name="isbn"><br>
    author:<input type="text" name="author"><br>
    <input type="submit" value="insert"><br>
</form>
<form action="/booklist" method="get">
    <input type="submit" value="booklist">

</form>
</body>
</html>

</body>
</html>
