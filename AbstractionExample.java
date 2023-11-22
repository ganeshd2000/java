package java;

abstract class Shape {
    public abstract double calculateArea();
    public void display() {
        System.out.println("This is a shape.");
    }
}

class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.PI * radius * radius;
    }
}

class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length * width;
    }
}


public class AbstractionExample {
    public static void main(String[] args) {

        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(4, 6);

        Shape shape1 = circle;
        Shape shape2 = rectangle;
        
        System.out.println("Area of Circle: " + shape1.calculateArea());
        shape1.display();

        System.out.println("Area of Rectangle: " + shape2.calculateArea());
        shape2.display();
    }
}
