package inheritance.stackOfStrings;

public class Main {
    public static void main(String[] args) {
        StackOfStrings stackOfStrings = new StackOfStrings();
        stackOfStrings.push("Goshko");
        stackOfStrings.push("Maria");
        stackOfStrings.push("Stamat");

        System.out.println(stackOfStrings.peek());
        System.out.println(stackOfStrings.pop());
        System.out.println(stackOfStrings.peek());
        System.out.println(stackOfStrings.isEmpty());
    }
}
