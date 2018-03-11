package pl.sdacademy.patterns.decorator;

public class CoffeeWithSugar extends CoffeeDecorator {

    public CoffeeWithSugar(Coffee espresso) {
        super(espresso);
    }

    @Override
    public void drink() {
        super.drink();
        System.out.println("with sugar");
    }
}
