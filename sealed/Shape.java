package sealed;

public sealed class Shape permits Circle, Square {
    // Common code or members for sealed.Shape
}

final class Circle extends Shape {
    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getArea() {
        return Math.PI * radius * radius;
    }
}

final class Square extends Shape {
    private final double side;

    public Square(double side) {
        this.side = side;
    }

    public double getArea() {
        return side * side;
    }
}

