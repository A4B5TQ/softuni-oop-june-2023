package inheritance.secondDemo;

public class HttpConnection {

    public String connect(String address) {
        return "Connected to " + address;
    }

    public void terminate() {
        System.out.println("Drop Connection");
    }
}
