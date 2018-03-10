package pl.sdacademy.patterns.observer;

public class ObserverMain {
    public static void main(String[] args) throws InterruptedException {


        Subscriber subscriber1 = new Subscriber();
        Subscriber subscriber2 = new Subscriber();
        Subscriber subscriber3 = new Subscriber();
        Subscriber subscriber4 = new Subscriber();
        Subscriber subscriber5 = new Subscriber();
        Subscriber subscriber6 = new Subscriber();

        Publisher publisher = new Publisher();

        new Thread(new Runnable() {
            @Override
            public void run() {
                publisher.simulateWork();
            }
        }).start();

        Thread.sleep(1000);
        publisher.subscribe(subscriber1);

        Thread.sleep(1000);
        publisher.subscribe(subscriber2);

        Thread.sleep(1000);
        publisher.subscribe(subscriber3);

        Thread.sleep(1000);
        publisher.subscribe(subscriber4);

        Thread.sleep(1000);
        publisher.subscribe(subscriber5);

        Thread.sleep(1000);
        publisher.subscribe(subscriber6);
    }
}
