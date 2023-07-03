package interfaces.sayHello;

public class European extends BasePerson {


    public European(String name) {
        super(name);
    }

    @Override
    public String sayHello() {
        return "Hello";
    }
}
