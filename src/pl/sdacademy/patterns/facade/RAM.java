package pl.sdacademy.patterns.facade;

public class RAM {

    OperatingSystem os;

    public void loadOSintoRam(OperatingSystem os) {
        this.os = os;
    }
}
