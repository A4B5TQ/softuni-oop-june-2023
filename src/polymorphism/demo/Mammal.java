package polymorphism.demo;

public class Mammal implements Animal {

    private String name;

    protected Mammal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Mammal{" +
                "name='" + name + '\'' +
                '}';
    }
}
