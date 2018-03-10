package pl.sdacademy.patterns.facade;

public class HDD {

    public OperatingSystem loadOS() {
        return new OperatingSystem();
    }
}
