package com.example.demoProject5;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet
public class UpdateServlet extends HttpServlet {
    @Override
    public void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        out.print("<html><body>");

        int id = Integer.parseInt(request.getParameter("id"));
        String name = request.getParameter("name");
        String classroom = request.getParameter("class");

        boolean found = false;
        for (Student student:
             StudentDatabase.students) {
            if (student.id == id) {
                student.name = name;
                student.classroom = classroom;
                found = true;
            }
        }
        if (!found) out.print("<h1> Student Not Found </h1>");
        out.print("</body></html>");
    }
}
