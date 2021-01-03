<%--
  Created by IntelliJ IDEA.
  User: sara
  Date: 10/24/2020
  Time: 8:28 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>delete-person</title>
</head>
<body style="background-color: #5969ba" align="center" >
<h1> Delete page</h1>
<form method="post" action="deletebook">
    <div class="container">
        <br><br>
        <label><b>Enter bookName: </b></label>
        <input type="text" placeholder="bookName" name="bookName" >
    </div>
    <br><br>

    <button type="submit">Delete</button>
</form>
</body>
</html>