package gojava.module8.practice;

public class Circle extends Shape {

    private int radius;

    public Circle(Point startPoint, int radius) {
        super(startPoint);
        this.radius = radius;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Circle{");
        sb.append(super.toString());
        sb.append(", radius=").append(radius);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public double getArea() {
        return radius * Math.pow(Math.PI, 2);
    }
}
