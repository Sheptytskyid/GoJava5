package gojava.module8.practice;

public class Square extends Shape {

    private int side;

    public Square(Point startPoint, int side) {
        super(startPoint);
        this.side = side;
    }

    @Override
    public double getArea() {
        return Math.pow(side, 2);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Square{");
        sb.append(super.toString());
        sb.append(", side=").append(side);
        sb.append('}');
        return sb.toString();
    }
}
