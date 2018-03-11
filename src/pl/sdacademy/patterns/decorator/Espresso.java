package pl.sdacademy.patterns.decorator;

public class Espresso implements Coffee {

    @Override
    public void drink() {
        System.out.println("Drinking coffee");
    }
}
