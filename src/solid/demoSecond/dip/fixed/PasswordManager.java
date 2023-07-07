package solid.demoSecond.dip.fixed;

import solid.demoSecond.ocp.fixed.PasswordHasher;

public class PasswordManager {

    private PasswordHasher passwordHasher;

    public PasswordManager(PasswordHasher passwordHasher) {
        this.passwordHasher = passwordHasher;
    }

    String hashPassword(String password) {
        return this.passwordHasher.hashPassword(password);
    }
}
