abstract class Shape {
    String color;
    Shape(String color) {
        this.color = color;
    }
    abstract double calculateArea();
    abstract void draw();
}
class Circle extends Shape {
    double radius;
    Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }
    @Override
    double calculateArea() {
        return 3.14 * radius * radius;
    }
    @Override
    void draw() {
        System.out.println("Drawing Circle");
    }
}
class Rectangle extends Shape {
    double length;
    double breadth;
    Rectangle(String color,
              double length,
              double breadth) {

        super(color);
        this.length = length;
        this.breadth = breadth;
    }
    @Override
    double calculateArea() {
        return length * breadth;
    }
    @Override
    void draw() {
        System.out.println("Drawing Rectangle");
    }
}
public class java_ass3_4 {
    public static void main(String[] args) {
        Shape c = new Circle("Red", 5);
        Shape r = new Rectangle("Blue", 4, 6);

        System.out.println(
                "Circle Area = "
                + c.calculateArea());
        c.draw();

        System.out.println(
                "Rectangle Area = "
                + r.calculateArea());
        r.draw();
    }
}
