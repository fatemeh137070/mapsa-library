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
<form method="post" action="updateperson">
    <div class="container">
        <br><br>
        <label><b>firstName: </b></label>
        <input type="text" placeholder="firstName" name="firstName" >
        <br>
        <label><b>lastName:  </b></label>
        <input type="text" placeholder="Enter New lastName" name="lastName" >
        <br>
        <label><b>codeMeli :  </b></label>
        <input type="text" placeholder="codeMeli" name="codeMeli" >


    </div>
    <br><br>

    <button type="submit">Update</button>

</form>
</body>
</html>
