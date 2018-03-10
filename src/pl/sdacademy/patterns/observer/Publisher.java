package pl.sdacademy.patterns.observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Publisher {

    final List<Subscriber> subscribers = new ArrayList<>();

    void subscribe(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    void unsubscribe(Subscriber subscriber) {
        subscribers.remove(subscriber);
    }

    void postEvent(Event event) {
        System.out.println("Sending update to " + subscribers.size() + " subscribers");
        for (Subscriber subscriber : subscribers) {
            subscriber.update(event);
        }
    }

    void simulateWork() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(2000);
                postEvent(new Event("Nowy film " + new Random().nextInt()));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
