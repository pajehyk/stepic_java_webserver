package accounts;

import dbService.DBException;
import dbService.DBService;
import dbService.dataSets.UsersDataSet;

/**
 * @author v.chibrikov
 *         <p>
 *         Пример кода для курса на https://stepic.org/
 *         <p>
 *         Описание курса и лицензия: https://github.com/vitaly-chibrikov/stepic_java_webserver
 */
public class AccountService {
    private DBService dbService;
    public AccountService() {
        dbService = new DBService();
    }

    public void addNewUser(UsersDataSet usersDataSet) throws DBException {
        dbService.addUser(usersDataSet);
    }

    public UsersDataSet getUserByLogin(String login) throws DBException {
        return dbService.getUser(login);
    }

    public boolean isRegistered(String login) throws DBException {
        UsersDataSet usersDataSet = getUserByLogin(login);
        if (usersDataSet == null) {
            return false;
        }
        return true;
    }


 /*   public UserProfile getUserBySessionId(String sessionId) {
        return sessionIdToProfile.get(sessionId);
    }

    public void addSession(String sessionId, UserProfile userProfile) {
        sessionIdToProfile.put(sessionId, userProfile);
    }

    public void deleteSession(String sessionId) {
        sessionIdToProfile.remove(sessionId);
    }*/
}
