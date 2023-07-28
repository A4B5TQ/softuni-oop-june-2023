package patterns.singleton;

public class Connector {

    private static Connector instance;

    private Connector() {

    }

    public static Connector getInstance() {
        if (instance == null) {
            synchronized (Connector.class) {
                if (instance == null) {
                    instance = new Connector();
                }
            }
        }

        return instance;
    }
}
