package polymorphism.mathOperations;

public class MathOperationSecond extends MathOperation {


    public double add(double a, int b) {
        return a + b;
    }

    public double add(int b,double a ) {
        return a + b;
    }

    @Override
    public int add(int a, int b) {
        return a + b * 2;
    }
}
