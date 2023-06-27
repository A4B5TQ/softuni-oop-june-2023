package inheritance.singleInheritance;

public class Main {
    public static void main(String[] args) {

        Animal animal = new Animal();
        animal.eat();

        Dog dog = new Dog();
        dog.eat();
        dog.bark();

        Puppy puppy = new Puppy();
        puppy.eat();
        puppy.bark();
        puppy.weep();
    }
}
