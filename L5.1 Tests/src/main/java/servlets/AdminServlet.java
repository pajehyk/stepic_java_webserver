package servlets;

import accountServer.AccountServerI;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AdminServlet extends HttpServlet {
    private AccountServerI accountServer;

    public AdminServlet(AccountServerI accountServer) {
        this.accountServer = accountServer;
    }

    public void doGet(HttpServletRequest request,
                      HttpServletResponse response) throws IOException {
        response.getWriter().println(accountServer.getUsersLimit());
    }
}
