package inheritance;


import inheritance.demoThree.Child;

public class Main {
    public static void main(String[] args) {
//
//        inheritance.demoThree.Person person = new Person(50);
//        System.out.println(person.getWeight());

        Child child = new Child(20);
        System.out.println(child.getWeight());

        System.out.println();

    }
}
