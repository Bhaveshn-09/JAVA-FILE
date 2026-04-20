package com.cookieservlet;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.WebServlet;

@WebServlet("/CookieServlet")
public class CookieServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String userName = request.getParameter("userName");

        // Create cookie for user
        if (userName != null && !userName.isEmpty()) {
            Cookie userCookie = new Cookie("user", userName);
            userCookie.setMaxAge(30); // expires in 30 seconds
            response.addCookie(userCookie);

            Cookie countCookie = new Cookie("count", "1");
            countCookie.setMaxAge(30);
            response.addCookie(countCookie);
        }

        // Read cookies
        Cookie[] cookies = request.getCookies();
        String name = null;
        int count = 0;

        if (cookies != null) {
            for (Cookie c : cookies) {
                if (c.getName().equals("user")) {
                    name = c.getValue();
                }
                if (c.getName().equals("count")) {
                    count = Integer.parseInt(c.getValue());
                }
            }
        }

        // If no cookie → go to login
        if (name == null) {
            response.sendRedirect("login.html");
            return;
        }

        // Increase visit count
        count++;
        Cookie countCookie = new Cookie("count", String.valueOf(count));
        countCookie.setMaxAge(30);
        response.addCookie(countCookie);

        // Output
        out.println("<html><body>");

        out.println("<h2 style='color:blue;'>Welcome back, " + name + "!</h2>");
        out.println("<h3>You have visited this page " + count + " times</h3>");

        // Display all cookies
        out.println("<h3>List of Cookies:</h3>");
        if (cookies != null) {
            for (Cookie c : cookies) {
                out.println("Name: " + c.getName() + " | Value: " + c.getValue() + "<br>");
            }
        }

        out.println("<br><p><b>Note:</b> Cookie expires in 30 seconds. Refresh after 30 sec to see effect.</p>");

        // Logout button
        out.println("<form action='CookieServlet' method='post'>");
        out.println("<input type='submit' value='Logout'>");
        out.println("</form>");

        out.println("</body></html>");
    }

    // Logout → delete cookies
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        Cookie user = new Cookie("user", "");
        user.setMaxAge(0);
        response.addCookie(user);

        Cookie count = new Cookie("count", "");
        count.setMaxAge(0);
        response.addCookie(count);

        response.sendRedirect("login.html");
    }
}

<!DOCTYPE html>
<html>
<head>
    <title>Cookie Login</title>
</head>
<body>

<h2>Enter Your Name</h2>

<form action="CookieServlet" method="get">
    Name: <input type="text" name="userName" required>
    <br><br>
    <input type="submit" value="Submit">
</form>

</body>
</html>