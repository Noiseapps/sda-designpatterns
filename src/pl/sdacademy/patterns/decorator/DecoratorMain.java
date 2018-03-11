package pl.sdacademy.patterns.decorator;

public class DecoratorMain {

    public static void main(String[] args) {

        Espresso espresso = new Espresso();
        CoffeeWithMilk coffeeWithMilk = new CoffeeWithMilk(espresso);
        CoffeeWithSugar coffeeWithSugar = new CoffeeWithSugar(coffeeWithMilk);
        coffeeWithSugar.drink();

        System.out.println(new CoffeeWithSugar(coffeeWithSugar).price());

//        new CoffeeWithMilk(new CoffeeWithSugar(new Espresso())).drink();
//
//        new CoffeeWithSugar(new Espresso()).drink();

    }
}
