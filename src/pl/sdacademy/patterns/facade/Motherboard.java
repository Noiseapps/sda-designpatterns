package pl.sdacademy.patterns.facade;

public class Motherboard {
    CPU cpu = new CPU();
    RAM ram = new RAM();
    HDD hdd = new HDD();

    void bootSystem() {
        OperatingSystem operatingSystem = cpu.loadOsFromHdd(hdd);
        cpu.storeOSIntoRAM(operatingSystem, ram);
    }
}
