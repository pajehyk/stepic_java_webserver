package servlets;

import accounts.AccountService;
import accounts.UserProfile;
import dbService.DBException;
import dbService.dataSets.UsersDataSet;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SignUpServlet extends HttpServlet {
    private AccountService accountService;

    public SignUpServlet(AccountService accountService) {
        this.accountService = accountService;
    }

    public void doPost(HttpServletRequest request,
                  HttpServletResponse response) {
        String login = request.getParameter("login");
        String password = request.getParameter("password");

        try {
            accountService.addNewUser(new UsersDataSet(login, password));
        } catch (DBException e) {
            e.printStackTrace();
        }
    }
}
