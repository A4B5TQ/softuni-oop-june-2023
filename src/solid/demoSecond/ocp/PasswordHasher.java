package solid.demoSecond.ocp;

public class PasswordHasher {
    public String hashPassword(String password, String hashingType) {
        String hashedPass = password;
        if ("Base64".equals(hashingType)) {
            hashedPass = "Base64 hashed pass";
        } else if ("MD5".equals(hashingType)) {
            hashedPass = "MD5 hashed pass";
        } else if ("NewAlg255".equals(hashingType)) {
            // another logic
        }

        return hashedPass;
    }
}
