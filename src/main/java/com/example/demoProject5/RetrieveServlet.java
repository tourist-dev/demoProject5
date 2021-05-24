package com.example.demoProject5;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "retrieveServlet", value = "/retrieveServlet")
public class RetrieveServlet extends HttpServlet {
    @Override
    public void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        int id = Integer.parseInt(request.getParameter("id"));

        boolean found = false;
        for (Student student:
             StudentDatabase.students) {
            if (student.id == id) {
                out.print("<h5>" + " ID: " + id + " NAME: " + student.name + " CLASS: " + student.classroom);
                found = true;
                break;
            }
        }
        if (!found) out.print("Not present in database");
        out.print("</body></html>");
    }
}
