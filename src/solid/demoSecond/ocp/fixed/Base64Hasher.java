package solid.demoSecond.ocp.fixed;

public class Base64Hasher implements PasswordHasher {
    @Override
    public String hashPassword(String password) {
        return "Base64 hashed pass";
    }
}
