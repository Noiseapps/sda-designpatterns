package pl.sdacademy.patterns.builder;

public class BuilderMain {

    public static void main(String[] args) {
        Car car = new Car.Builder(2.0,
                5,
                "Kombi").
                setHasNavi(true).
                setHasAbs(true).
                setAirbagCount(10).
                build();

        Car car2 = new Car.Builder(2.0,
                5,
                "Kombi").
                setHasAbs(true).
                setHasESP(true).
                setAirbagCount(2).
                build();
    }
}
