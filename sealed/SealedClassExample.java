package sealed;

public class SealedClassExample {
    public static void main(String[] args) {
        Shape circle = new Circle(5.0);
        Shape square = new Square(4.0);

        displayArea(circle);
        displayArea(square);
    }

    public static void displayArea(Shape shape) {
        if (shape instanceof Circle) {
            Circle circle = (Circle) shape;
            System.out.println("Circle Area: " + circle.getArea());
        } else if (shape instanceof Square) {
            Square square = (Square) shape;
            System.out.println("Square Area: " + square.getArea());
        } else {
            System.out.println("Unknown shape");
        }
    }
}

