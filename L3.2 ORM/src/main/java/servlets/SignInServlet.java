package servlets;

import accounts.AccountService;
import dbService.DBException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class SignInServlet extends HttpServlet {
    private AccountService accountService;
    public SignInServlet(AccountService accountService) {
        this.accountService = accountService;
    }
    public void doPost(HttpServletRequest request,
                       HttpServletResponse response) throws IOException {
        String login = request.getParameter("login");
        String password = request.getParameter("password");

        response.setContentType("text/html;charset=utf-8");
        try {
            if (accountService.isRegistered(login)) {
                response.setStatus(200);
                response.getWriter().println("Authorized: " + login);
            } else {
                response.setStatus(401);
                response.getWriter().println("Unathorized");
            }
        } catch (DBException e) {
            e.printStackTrace();
        }
    }
}
