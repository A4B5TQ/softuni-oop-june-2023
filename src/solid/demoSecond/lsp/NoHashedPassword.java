package solid.demoSecond.lsp;

import solid.demoSecond.ocp.fixed.PasswordHasher;

public class NoHashedPassword extends HashedPassword {


    public NoHashedPassword(PasswordHasher passwordHasher) {
        super(new NoHashedPasswordHasher());
    }
}
