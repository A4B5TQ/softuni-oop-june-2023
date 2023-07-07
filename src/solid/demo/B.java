package solid.demo;

public class B implements A {
    @Override
    public String doSomething() {
        return "doSomething";
    }

    @Override
    public String doSomethingElse() {
        return "doSomethingElse";
    }
}
