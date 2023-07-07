package solid.demoSecond.dip;

import solid.demoSecond.ocp.fixed.Base64Hasher;

public class PasswordManager {

    private Base64Hasher hasher;

    public PasswordManager(Base64Hasher hasher) {
        this.hasher = hasher;
    }

    void hashPassword(String password) {
        this.hasher.hashPassword(password);
    }
}
