<%--
  Created by IntelliJ IDEA.
  User: sara
  Date: 10/22/2020
  Time: 12:30 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>$Title$</title>
</head>
<body>
<c:forEach items="${books}" var="book" >
    <p>id: ${book.id}</p>
    <p>bookName: ${book.bookName}</p>
    <p>author: ${book.author}</p>
    <p>isbn: ${book.isbn}</p>
    <hr/>
</c:forEach>
</body>
</html>
