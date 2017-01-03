package gojava.module8.practice;

public abstract class Shape {

    private Point startPoint;

    public Shape(Point startPoint) {
        this.startPoint = startPoint;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Shape{");
        sb.append("startPoint=").append(startPoint);
        sb.append('}');
        return sb.toString();
    }

    public abstract double getArea();
}
