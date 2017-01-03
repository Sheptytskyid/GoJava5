package gojava.module8.practice;

public class Point {

    private int coordinateX;
    private int coordinateY;

    public Point(int coordinateX, int coordinateY) {
        this.coordinateX = coordinateX;
        this.coordinateY = coordinateY;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Point{");
        sb.append("coordinateX=").append(coordinateX);
        sb.append(", coordinateY=").append(coordinateY);
        sb.append('}');
        return sb.toString();
    }
}
