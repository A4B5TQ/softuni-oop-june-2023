package polymorphism.demo;

public class Start {
    public static void main(String[] args) {

        Animal animal = new Person("Animal");
        Animal person = new Mammal("Person");

        System.out.println(animal.toString());
        System.out.println(person.toString());


    }

    private static void callToStringAndPrint(Animal animal) {
        System.out.println(animal.toString());
    }

    private static void test(Object animal) {


        // logic

        Person person = (Person) animal;
        System.out.println(person);

        if (animal instanceof Person) {
            double salary = ((Person) animal).getSalary();
            System.out.println(salary);
        }
    }
}
