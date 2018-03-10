package pl.sdacademy.patterns.factory;

public class ShapeFactory {

    public static Shape createShape(String shapeName, double... params) {
        Shape shape = null;
        switch (shapeName.toLowerCase()) {
            case "square":
                shape = new Square(params[0]);
                break;
            case "circle":
                shape = new Circle(params[0]);
                break;
            case "rect":
                shape = new Rectangle(params[0], params[1]);
                break;
        }
        return shape;
    }
}

class Square implements Shape {

    double sideLength;

    @Override
    public String getName() {
        return "SQUARE";
    }

    @Override
    public double getArea() {
        return sideLength * sideLength;
    }

    public Square(double sideLength) {
        this.sideLength = sideLength;
    }
}

class Circle implements Shape {

    double radius;

    @Override
    public String getName() {
        return "CIRCLE";
    }

    @Override
    public double getArea() {
        return Math.PI * radius * radius;
    }

    public Circle(double radius) {
        this.radius = radius;
    }
}

class Rectangle implements Shape {

    double a,b;

    @Override
    public String getName() {
        return "RECT";
    }

    @Override
    public double getArea() {
        return a * b;
    }

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }
}