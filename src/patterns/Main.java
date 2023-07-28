package patterns;

import patterns.facade.ClientFacade;
import patterns.observer.*;

public class Main {
    public static void main(String[] args) {
        Observer subscriberOne = new SubscriberOne();
        Observer subscriberTwo = new SubscriberTwo();
        Observer subscriberThree = new SubscriberThree();

        Subject publisher = new Publisher();

        publisher.attach(subscriberOne);
        publisher.attach(subscriberTwo);

        publisher.notifyForUpdate(new Data("Observer Pattern"));

        publisher.detach(subscriberOne);
        publisher.attach(subscriberThree);

        publisher.notifyForUpdate(new Data("I learn observer pattern"));

    }

    public static void doSomething(ClientFacade clientFacade) {
        clientFacade.connect("");
    }
}
