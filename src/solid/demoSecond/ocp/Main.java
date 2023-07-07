package solid.demoSecond.ocp;

import solid.demoSecond.ocp.fixed.Base64Hasher;
import solid.demoSecond.ocp.fixed.MD5Hasher;
import solid.demoSecond.ocp.fixed.NewAlg255Hasher;
import solid.demoSecond.ocp.fixed.PasswordHasher;

public class Main {
    public static void main(String[] args) {
//        solid.demoSecond.ocp.PasswordHasher psh = new solid.demoSecond.ocp.PasswordHasher();
//        psh.hashPassword("asda","Base64");

        String password = "Password";

        System.out.println(hashPassword(new Base64Hasher(),password));
        System.out.println(hashPassword(new MD5Hasher(),password));
        System.out.println(hashPassword(new NewAlg255Hasher(),password));

    }

    public static String hashPassword(PasswordHasher passwordHasher, String password) {
        return passwordHasher.hashPassword(password);
    }
}
