package pl.sdacademy.patterns.decorator;

public abstract class CoffeeDecorator implements Coffee {

    Coffee baseCoffee;

    public CoffeeDecorator(Coffee baseCoffee) {
        this.baseCoffee = baseCoffee;
    }

    @Override
    public void drink() {
        baseCoffee.drink();
    }

    @Override
    public double price() {
        return baseCoffee.price();
    }
}
