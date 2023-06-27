package encapsulation.secondDemo;

import encapsulation.demo.Person;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Test test = new Test();

        ArrayList a = new ArrayList();

        Person person = new Person(30,"Goshko");
        System.out.println(person.getName());
        System.out.println();
    }
}
