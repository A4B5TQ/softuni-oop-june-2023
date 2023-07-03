package interfaces.demo;

public class Document implements Printable, Closable {
    @Override
    public void close() {
        System.out.println("Close");
    }

    @Override
    public void print() {
        System.out.println("ABC");
    }

    public void printText(String text) {
        System.out.println(text);
    }

}
