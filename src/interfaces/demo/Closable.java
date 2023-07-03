package interfaces.demo;

public interface Closable extends Printable {

    void close();

    default void print() {
        Printable.super.print();
    }
}
