package servlets;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.logging.XMLFormatter;

public class ResourcesServlet extends HttpServlet {
    public void doPost(HttpServletRequest request,
                       HttpServletResponse response) {
        String path = request.getParameter("path");
    }
}
