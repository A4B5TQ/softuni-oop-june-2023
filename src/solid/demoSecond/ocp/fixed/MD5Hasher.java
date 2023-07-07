package solid.demoSecond.ocp.fixed;

public class MD5Hasher implements PasswordHasher {
    @Override
    public String hashPassword(String password) {
        return "MD5 hashed pass";
    }
}
