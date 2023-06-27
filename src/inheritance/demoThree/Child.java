package inheritance.demoThree;

public class Child extends Person {

    public Child(int weight) {
        super(weight);
    }

    @Override
    public int getWeight() {
        return 0;
    }
}
