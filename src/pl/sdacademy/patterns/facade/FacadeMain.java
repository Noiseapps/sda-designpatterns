package pl.sdacademy.patterns.facade;

public class FacadeMain {

    public static void main(String[] args) {
        // startup
        CPU cpu = new CPU();
        OperatingSystem operatingSystem = cpu.loadOsFromHdd(new HDD());
        cpu.storeOSIntoRAM(operatingSystem, new RAM());


        // using motherboard facade
        new Motherboard().bootSystem();
    }
}
