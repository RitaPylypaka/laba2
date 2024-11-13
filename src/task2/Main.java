package task2;

public class Main {
    public static void main(String[] args) {
        Shape triangle = new Triangle(3, 4);
        Shape square = new Square(5);
        Shape circle = new Circle(7);
        Shape cube = new Cube(3);
        Shape sphere = new Sphere(4);
        Shape pyramid = new Pyramid(4, 6);
        Shape rectangle = new Rectangle(4, 5);

        System.out.println("Rectangle Area: " + rectangle.calculateArea());
        System.out.println("Pyramid Area: " + pyramid.calculateArea());
        System.out.println("Pyramid Volume: " + pyramid.calculateVolume());
        System.out.println("Triangle Area: " + triangle.calculateArea());
        System.out.println("Square Area: " + square.calculateArea());
        System.out.println("Circle Area: " + circle.calculateArea());
        System.out.println("Cube Area: " + cube.calculateArea());
        System.out.println("Cube Volume: " + cube.calculateVolume());
        System.out.println("Sphere Area: " + sphere.calculateArea());
        System.out.println("Sphere Volume: " + sphere.calculateVolume());
    }
}