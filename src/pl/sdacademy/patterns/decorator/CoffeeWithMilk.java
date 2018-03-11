package pl.sdacademy.patterns.decorator;

public class CoffeeWithMilk extends CoffeeDecorator {

    public CoffeeWithMilk(Coffee espresso) {
        super(espresso);
    }

    @Override
    public void drink() {
        super.drink();
        System.out.println("with milk");
    }

    @Override
    public double price() {
        return super.price() + 5;
    }
}
