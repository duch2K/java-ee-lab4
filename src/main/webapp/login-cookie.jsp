
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Login</title>
</head>
<body>
    <jsp:include page="link-cookie.jsp" />
    <br>
    <form action="LoginServlet" method="post">
        Name:<input type="text" name="name"><br>
        Password:<input type="password" name="password"><br>
        <input type="submit" value="login">
    </form>
</body>
</html>
