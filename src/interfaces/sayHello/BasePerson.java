package interfaces.sayHello;

public abstract class BasePerson implements Person {

    private String name;

    public BasePerson(String name) {
        this.setName(name);
    }


    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public abstract String sayHello();

    private void setName(String name) {
        this.name = name;
    }
}
