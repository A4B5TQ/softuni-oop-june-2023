package solid.demoSecond.ocp.fixed;

public class NewAlg255Hasher implements PasswordHasher {
    @Override
    public String hashPassword(String password) {
        return "NewAlg255 hashed pass";
    }
}
