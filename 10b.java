import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class ResultServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String roll = request.getParameter("rollno");
        String name = request.getParameter("name");
        String[] marksStr = request.getParameterValues("marks");

        int marks[] = new int[5];
        int total = 0;
        boolean pass = true;

        try {
            // Server-side validation
            if (roll == null || name == null || marksStr.length != 5) {
                throw new Exception("Invalid Input");
            }

            for (int i = 0; i < 5; i++) {
                marks[i] = Integer.parseInt(marksStr[i]);

                if (marks[i] < 0 || marks[i] > 100) {
                    throw new Exception("Marks must be 0-100");
                }

                if (marks[i] < 40) {
                    pass = false;
                }

                total += marks[i];
            }

        } catch (Exception e) {
            response.getWriter().println("<h3 style='color:red;'>Error: " + e.getMessage() + "</h3>");
            return;
        }

        double avg = total / 5.0;
        String result = pass ? "PASS" : "FAIL";

        // Send data to JSP
        request.setAttribute("roll", roll);
        request.setAttribute("name", name);
        request.setAttribute("marks", marks);
        request.setAttribute("avg", avg);
        request.setAttribute("result", result);

        RequestDispatcher rd = request.getRequestDispatcher("result.jsp");
        rd.forward(request, response);
    }
}

<!DOCTYPE html>
<html>
<head>
    <title>Student Result Form</title>

    <script>
        function validateForm() {
            let roll = document.forms["myForm"]["rollno"].value;
            let name = document.forms["myForm"]["name"].value;
            let marks = document.forms["myForm"]["marks"];

            if (roll === "" || name === "") {
                alert("All fields are required!");
                return false;
            }

            for (let i = 0; i < marks.length; i++) {
                let m = marks[i].value;
                if (m === "" || isNaN(m) || m < 0 || m > 100) {
                    alert("Enter valid marks (0-100)");
                    return false;
                }
            }
            return true;
        }
    </script>
</head>

<body>

<h2>Student Result Form</h2>

<form name="myForm" action="ResultServlet" method="post" onsubmit="return validateForm()">

    Roll No: <input type="text" name="rollno"><br><br>
    Name: <input type="text" name="name"><br><br>

    Sub1: <input type="text" name="marks"><br><br>
    Sub2: <input type="text" name="marks"><br><br>
    Sub3: <input type="text" name="marks"><br><br>
    Sub4: <input type="text" name="marks"><br><br>
    Sub5: <input type="text" name="marks"><br><br>

    <input type="submit" value="Submit">

</form>

</body>
</html>

<%@ page import="java.util.*" %>

<html>
<head>
    <title>Result</title>
</head>
<body>

<h2>Student Result</h2>

<p><b>Roll No:</b> ${roll}</p>
<p><b>Name:</b> ${name}</p>

<h3>Marks:</h3>
<%
    int[] marks = (int[]) request.getAttribute("marks");
    for (int i = 0; i < marks.length; i++) {
%>
    Subject <%= (i+1) %>: <%= marks[i] %><br>
<%
    }
%>

<br>
<p><b>Average:</b> ${avg}</p>
<p><b>Result:</b> ${result}</p>

<br>
<a href="index.jsp">Go Back to Form</a>

</body>
</html>
