package pl.sdacademy.patterns.facade;

public class CPU {

    public OperatingSystem loadOsFromHdd(HDD hardDrive) {
        return hardDrive.loadOS();
    }

    public void storeOSIntoRAM(OperatingSystem os, RAM ram) {
        ram.loadOSintoRam(os);
    }
}
