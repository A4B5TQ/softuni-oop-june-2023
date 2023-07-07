package solid.demoSecond.srp;

public class PasswordHasher {

    public void hashAndSave(String password) {
        String s = this.hashPassword(password);
        this.saveToDB(s);
    }

    public String hashPassword(String password) {
        return "Hashed password";
    }

    public void saveToDB(String hashedPassword) {
        // save to db
    }
}
