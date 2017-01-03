package gojava.module8.practice;

public class Rectangle extends Shape {

    private int height;
    private int width;

    public Rectangle(Point startPoint, int height, int width) {
        super(startPoint);
        this.height = height;
        this.width = width;
    }

    @Override
    public double getArea() {
        return height * width;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rectangle{");
        sb.append(super.toString());
        sb.append(", height=").append(height);
        sb.append(", width=").append(width);
        sb.append('}');
        return sb.toString();
    }
}
