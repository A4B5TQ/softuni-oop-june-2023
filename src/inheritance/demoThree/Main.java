package inheritance.demoThree;

public class Main {
    public static void main(String[] args) {

        Person person = new Person(10);
        Child child = new Child(10);
        System.out.println(child.getWeight());

    }
}
