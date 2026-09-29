abstract class Shape {
    abstract double area();

    void describe() {
        System.out.println("I am a shape");
    }
}

class Circle extends Shape {
    double radius = 5;

    @Override
    double area() {
        return 3.14 * radius * radius;
    }
}

public class AbstractChildOnly {
    public static void main(String[] args) {
        Circle c = new Circle();
        System.out.println("Area: " + c.area());
        c.describe();
    }
}
