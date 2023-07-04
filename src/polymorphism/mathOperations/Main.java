package polymorphism.mathOperations;

public class Main {

    public static void main(String[] args) {
        MathOperationSecond mathOperation = new MathOperationSecond();
        System.out.println(mathOperation.add(5, 6));
        System.out.println(mathOperation.add(7, 13, 10));
        System.out.println(mathOperation.add(10, 20, 30, 40));
    }
}
