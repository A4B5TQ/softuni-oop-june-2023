package patterns.observer;

public class SubscriberTwo implements Observer {
    @Override
    public void update(Data data) {
        System.out.println(this.getClass().getSimpleName() + " -> " + data.getContent());
    }
}
