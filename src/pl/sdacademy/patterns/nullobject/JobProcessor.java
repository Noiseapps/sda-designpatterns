package pl.sdacademy.patterns.nullobject;

public class JobProcessor {

    private final static NullCallback dummyCallback = new NullCallback();

    private MyCallback callback = dummyCallback;

    public void setCallback(MyCallback callback) {
        if(callback == null) {
            this.callback = dummyCallback;
        } else {
            this.callback = callback;
        }
    }

    void processJob() {
        try {
            Thread.sleep(5000);
            callback.jobDone("Done");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static class NullCallback implements MyCallback {
        @Override
        public void jobDone(String param) {
            // do nothing
        }
    }
}
