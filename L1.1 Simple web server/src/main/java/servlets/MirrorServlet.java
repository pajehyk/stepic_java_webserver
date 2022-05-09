package servlets;

import templater.PageGenerator;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class MirrorServlet extends HttpServlet {
    public void doGet(HttpServletRequest request,
                      HttpServletResponse response) throws IOException {
        Map<String, Object> pageVariables = new HashMap<>();
        pageVariables.put("key", request.getParameter("key") != null ? request.getParameter("key") : "");
        String message = request.getParameter("message");
        pageVariables.put("message", message == null ? "" : message);
        pageVariables.put("pathInfo", "");
        response.getWriter().println(PageGenerator.instance().getPage("mirror.html", pageVariables));

        response.setContentType("text/html;charset=utf-8");
        response.setStatus(HttpServletResponse.SC_OK);
    }
}
