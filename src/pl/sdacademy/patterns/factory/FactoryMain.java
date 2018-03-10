package pl.sdacademy.patterns.factory;

public class FactoryMain {

    public static void main(String[] args) {
        Shape shape = ShapeFactory.createShape("circle", 23.1);

        String format = String.format("The area of %s is %f cm2", shape.getName(), shape.getArea());
        System.out.println(format);
    }
}
