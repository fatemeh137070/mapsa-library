<%--
  Created by IntelliJ IDEA.
  User: sara
  Date: 10/22/2020
  Time: 12:52 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>delete-person</title>
</head>
<body style="background-color: #5969ba" align="center" >
<h1> Delete page</h1>
<form method="post" action="deleteperson">
    <div class="container">
        <br><br>
        <label><b>Enter firstName: </b></label>
        <input type="text" placeholder="firstName" name="firstName" >
    </div>
    <br><br>

    <button type="submit">Delete</button>
</form>
</body>
</html>