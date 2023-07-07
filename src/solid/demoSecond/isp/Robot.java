package solid.demoSecond.isp;

public class Robot implements Worker {
    @Override
    public void work() {
        // working
    }

    @Override
    public void workHard() {

    }

    @Override
    public void sleep() {
        throw new UnsupportedOperationException();
    }
}
