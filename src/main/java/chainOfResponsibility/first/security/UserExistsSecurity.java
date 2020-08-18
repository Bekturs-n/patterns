package chainOfResponsibility.first.security;

import chainOfResponsibility.first.Server;

public class UserExistsSecurity extends Security {
    Server server;

    public UserExistsSecurity(Server server) {
        this.server = server;
    }

    @Override
    public boolean check(String email, String password) {
        if (!server.hasEmail(email)) {
            System.out.println("This email is not registered!");
            return false;
        }
        if (!server.isValidPassword(email, password)) {
            System.out.println("Wrong password!");
            return false;
        }
        return checkNext(email, password);
    }

}
