package solid.demoSecond.lsp;

import solid.demoSecond.ocp.fixed.PasswordHasher;

public class NoHashedPasswordHasher implements PasswordHasher {

    @Override
    public String hashPassword(String password) {
        throw new UnsupportedOperationException();
//        return password;
    }
}
