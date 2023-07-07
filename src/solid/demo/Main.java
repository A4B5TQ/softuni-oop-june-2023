package solid.demo;

public class Main {
    public static void main(String[] args) {
        A a = new B();
        A c = new C();
        printDoSomething(a);
        printDoSomething(c);

    }

    private static void printDoSomething(A a) {
        System.out.println(a.doSomething());
        System.out.println(a.doSomethingElse());
    }
}
