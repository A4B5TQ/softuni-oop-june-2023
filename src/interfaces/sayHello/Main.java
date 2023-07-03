package interfaces.sayHello;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Person> persons = new ArrayList<>();

        printCollectionSecond(persons);

        persons.add(new Bulgarian("Peter"));
        persons.add(new European("Peter"));
        persons.add(new Chinese("Peter"));

        for (Person person : persons) {
            print(person);
        }
    }

    private static void print(Person person) {
        System.out.println(person.sayHello());
    }

    private static void printCollection(List<Person> personList) {
        System.out.println(personList);
    }

    private static void printCollectionSecond(Iterable<Person> personList) {
        System.out.println(personList);
    }
}
