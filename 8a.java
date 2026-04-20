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

        // Create cookies
        if (userName != null && !userName.isEmpty()) {
            Cookie userCookie = new Cookie("user", userName);
            userCookie.setMaxAge(60);
            response.addCookie(userCookie);

            Cookie visitCookie = new Cookie("count", "1");
            visitCookie.setMaxAge(60);
            response.addCookie(visitCookie);
        }

        // Read cookies
        Cookie[] cookies = request.getCookies();
        String existingUser = null;
        int count = 0;

        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (cookie.getName().equals("user")) {
                    existingUser = cookie.getValue();
                }
                if (cookie.getName().equals("count")) {
                    count = Integer.parseInt(cookie.getValue());
                }
            }
        }

        // If no user → redirect to HTML page
        if (existingUser == null) {
            response.sendRedirect("login.html");
            return;
        }

        // Increment count
        count++;
        Cookie visitCookie = new Cookie("count", String.valueOf(count));
        visitCookie.setMaxAge(60);
        response.addCookie(visitCookie);

        // Display output
        out.println("<html><body>");
        out.println("<h2 style='color:blue;'>Welcome back, " + existingUser + "!</h2>");
        out.println("<h2 style='color:magenta;'>You have visited this page " + count + " times!</h2>");

        // Logout button
        out.println("<form action='CookieServlet' method='post'>");
        out.println("<input type='submit' value='Logout'>");
        out.println("</form>");

        out.println("</body></html>");
    }

    // Logout
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        Cookie userCookie = new Cookie("user", "");
        userCookie.setMaxAge(0);
        response.addCookie(userCookie);

        Cookie visitCookie = new Cookie("count", "");
        visitCookie.setMaxAge(0);
        response.addCookie(visitCookie);

        response.sendRedirect("login.html");
    }
}