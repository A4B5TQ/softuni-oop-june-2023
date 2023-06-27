package encapsulation.increaseSalary;

import java.text.DecimalFormat;

public class Person {

    private String firstName;
    private String lastName;
    private int age;

    private double salary;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public Person(String firstName, String lastName, int age, double salary) {
        this(firstName,lastName,age);
        this.salary = salary;
    }

    public String getFirstName() {
        return firstName;
    }

    public int getAge() {
        return age;
    }

    public String getLastName() {
        return lastName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public void increaseSalary(double bonus) {

        // 20 percent bonus
        // 0.2
        // modifier = 1.2
        // 100 * 1.2 = 120 (salary + 20% bonus)

        bonus = bonus / 100;

        double modifier = 1;

        if (this.getAge() < 30) {
            modifier += bonus / 2;
        } else {
            modifier += bonus;
        }

        this.setSalary(this.getSalary() * modifier);
    }

    @Override
    public String toString() {
        return String.format("%s %s gets %s leva",
                this.getFirstName(),
                this.getLastName(),
                new DecimalFormat("#.0#####").format(this.getSalary()));
    }
}
