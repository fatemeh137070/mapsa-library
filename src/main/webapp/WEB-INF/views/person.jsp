<%--
  Created by IntelliJ IDEA.
  User: sara
  Date: 10/22/2020
  Time: 12:56 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>$Title$</title>
</head>
<body>
<c:forEach items="${persons}" var="person" >
    <p>id: ${person.id}</p>
    <p>firstName: ${person.firstName}</p>
    <p>lastName: ${person.lastName}</p>
    <p>codeMeli: ${person.codeMeli}</p>
    <hr/>
</c:forEach>
</body>
</html>

