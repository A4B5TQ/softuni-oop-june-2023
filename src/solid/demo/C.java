package solid.demo;

public class C implements A {
    @Override
    public String doSomething() {
        return "Do something from C";
    }

    @Override
    public String doSomethingElse() {
        throw new UnsupportedOperationException();
//        return null;
    }
}
