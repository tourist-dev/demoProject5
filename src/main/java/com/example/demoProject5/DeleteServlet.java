package com.example.demoProject5;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "deleteServlet", value = "/deleteServlet")
public class DeleteServlet {
    public void service(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        PrintWriter out = response.getWriter();
        out.print("<html><body>");
        int id = Integer.parseInt(request.getParameter("id"));

        boolean found = false;
        int index = 0;

        for (int i = 0; i < StudentDatabase.students.size(); i++) {
            if (StudentDatabase.students.get(i).id == id) {
                index = i;
                found = true;
                break;
            }
        }
        if (found) {
            StudentDatabase.students.remove(index);
            out.print("<h1> Deleted </h1>");
        }
        else {
            out.print("<h1> Not Found </h1>");
        }
        out.print("</body></html>");
    }
}
