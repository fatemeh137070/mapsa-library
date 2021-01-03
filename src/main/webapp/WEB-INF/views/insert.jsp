<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: sara
  Date: 10/25/2020
  Time: 5:55 AM
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
<c:if test="${message ne null}"
> ${message}</c:if>
<form action="/insertperson" method="post">
    firstName:<input type="text" name="firstName"><br>
    lastName:<input type="text" name="lastName"><br>
    codeMeli:<input type="text" name="codeMeli"><br>
    <input type="submit" value="insert"><br>
</form>
<form action="personlist" method="get">
    <input type="submit" value="listperson">

</form>


</body>
</html>
