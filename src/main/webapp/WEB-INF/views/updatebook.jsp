<%--
  Created by IntelliJ IDEA.
  User: sara
  Date: 10/22/2020
  Time: 12:58 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>update</title>
</head>
<body style="background-color: #95699f" align="center" >
<h1> Update page</h1>
<form method="post" action="updatebook">
    <div class="container">
        <br><br>
        <label><b>bookName: </b></label>
        <input type="text" placeholder="bookName" name="bookName" >
        <br>
        <label><b>isbn:  </b></label>
        <input type="text" placeholder="Enter New isbn" name="isbn" >
        <br>
        <label><b>author :  </b></label>
        <input type="text" placeholder=" Enter New author" name="author" >


    </div>
    <br><br>

    <button type="submit">Update</button>

</form>
</body>
</html>
