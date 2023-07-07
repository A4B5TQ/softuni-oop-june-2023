package solid.demoSecond.lsp;

import solid.demoSecond.ocp.fixed.Base64Hasher;

public class Base64HashedPassword extends HashedPassword {

    public Base64HashedPassword() {
        super(new Base64Hasher());
    }
}
