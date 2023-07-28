package patterns.observer;

public class SubscriberThree implements Observer {
    @Override
    public void update(Data data) {
        System.out.println(this.getClass().getSimpleName() + " -> " + data.getContent());
    }
}
