package pl.sdacademy.patterns.nullobject;

public class NullObjectMain {

    public static void main(String[] args) {
        JobProcessor processor = new JobProcessor();

        processor.setCallback(new MyCallback() {
            @Override
            public void jobDone(String param) {
                System.out.println(param);
            }
        });

//        processor.setCallback(null);

        new Thread(new Runnable() {
            @Override
            public void run() {
                processor.processJob();
            }
        }).start();
    }
}
