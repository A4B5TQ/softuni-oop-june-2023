package polymorphism.demo;

public class Person extends Mammal {

    private double salary;


    public Person(String name, double salary) {
        this(name);
        this.salary = salary;
    }

    public Person(String name) {
        super(name);
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Person{" +
                "salary=" + salary +
                '}';
    }
}
