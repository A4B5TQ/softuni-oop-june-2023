package solid.demoSecond.lsp;

import solid.demoSecond.ocp.fixed.PasswordHasher;

public abstract class HashedPassword {

    PasswordHasher passwordHasher;
    String hashedPass;

    public HashedPassword(PasswordHasher passwordHasher) {
        this.passwordHasher = passwordHasher;
    }

    void generateHashedPassword(String password) {
        this.hashedPass = this.passwordHasher.hashPassword(password);
    }
}
