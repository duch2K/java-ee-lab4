
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Session login</title>
</head>
<body>
    <form action="SessionLoginServlet" method="post">
        Name:<input type="text" name="name"><br>
        Password:<input type="password" name="password"><br>
        <input type="submit" value="login">
    </form>
</body>
</html>
