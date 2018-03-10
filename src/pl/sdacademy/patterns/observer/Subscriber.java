package pl.sdacademy.patterns.observer;

import java.util.UUID;

public class Subscriber {

    final String uuid;

    public Subscriber() {
        uuid = UUID.randomUUID().toString();
    }

    public void update(Event event) {
        System.out.println(uuid + " : " + event.content);
    }
}
