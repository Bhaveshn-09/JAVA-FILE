<!DOCTYPE html>
<html>
<head>
    <title>Session Login</title>
</head>
<body>

<h2>Enter Your Name</h2>

<form action="session.jsp" method="post">
    Name: <input type="text" name="username" required>
    <br><br>
    <input type="submit" value="Submit">
</form>

</body>
</html>

<%@ page import="java.util.*" %>

<%
    // Get name from form
    String name = request.getParameter("username");

    if (name != null) {
        session.setAttribute("user", name);
    }

    // Set session timeout (in seconds)
    session.setMaxInactiveInterval(60); // 1 minute

    String user = (String) session.getAttribute("user");
%>

<html>
<head>
    <title>Session Page</title>
</head>
<body>

<% if (user != null) { %>

    <h2 style="color:blue;">Hello <%= user %>!</h2>

    <p>Session will expire in <b>1 minute</b>.</p>

    <a href="check.jsp">Click here to check session</a>

<% } else { %>

    <h2 style="color:red;">Session expired! Please login again.</h2>
    <a href="index.html">Go to Login</a>

<% } %>

</body>
</html>

<%
    String user = (String) session.getAttribute("user");
%>

<html>
<head>
    <title>Check Session</title>
</head>
<body>

<% if (user != null) { %>

    <h2 style="color:green;">Session Active!</h2>
    <h3>Hello <%= user %> 👋</h3>

<% } else { %>

    <h2 style="color:red;">Session Expired!</h2>
    <a href="index.html">Login Again</a>

<% } %>

</body>
</html>