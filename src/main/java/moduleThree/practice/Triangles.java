package moduleThree.practice;

public class Triangles {
    private int x1Coordinate;
    private int y1Coordinate;
    private int x2Coordinate;
    private int y2Coordinate;
    private int x3Coordinate;
    private int y3Coordinate;

    public Triangles(int x1Coordinate, int y1Coordinate, int x2Coordinate, int y2Coordinate, int x3Coordinate,
                     int y3Coordinate) {
        this.x1Coordinate = x1Coordinate;
        this.y1Coordinate = y2Coordinate;
        this.x2Coordinate = x2Coordinate;
        this.y2Coordinate = y2Coordinate;
        this.x3Coordinate = x3Coordinate;
        this.y3Coordinate = y3Coordinate;
        if (Double.compare(area(),0) == 0) {
            System.out.println("points are on the same line");
        }
    }

    public double perimeter() {
        double line1 = Math.sqrt(Math.pow(x1Coordinate - x2Coordinate, 2) + Math.pow(y1Coordinate - y2Coordinate, 2));
        double line2 = Math.sqrt(Math.pow(x2Coordinate - x3Coordinate, 2) + Math.pow(y2Coordinate - y3Coordinate, 2));
        double line3 = Math.sqrt(Math.pow(x3Coordinate - x1Coordinate, 2) + Math.pow(y3Coordinate - y1Coordinate, 2));
        double perimeter = line1 + line2 + line3;
        return perimeter;
    }

    double area() {
        double line1 = Math.sqrt(Math.pow(x1Coordinate - x2Coordinate, 2) + Math.pow(y1Coordinate - y2Coordinate, 2));
        double line2 = Math.sqrt(Math.pow(x2Coordinate - x3Coordinate, 2) + Math.pow(y2Coordinate - y3Coordinate, 2));
        double line3 = Math.sqrt(Math.pow(x3Coordinate - x1Coordinate, 2) + Math.pow(y3Coordinate - y1Coordinate, 2));
        double s = (line1 + line2 + line3) / 2;
        double area = Math.sqrt(s * (s - line1) * (s - line2) * (s - line3));
        return area;
    }

    public int getX1Coordinate() {
        return x1Coordinate;
    }

    public void setX1Coordinate(int x1Coordinate) {
        if (Double.compare(area(),0) !=0) {
            System.out.println("points are on the same line");
            return;
        }
        this.x1Coordinate = x1Coordinate;
    }

    public int getY1Coordinate() {
        return y1Coordinate;
    }

    public void setY1Coordinate(int y1Coordinate) {
        if (Double.compare(area(),0) !=0) {
            System.out.println("points are on the same line");
            return;
        }
        this.y1Coordinate = y1Coordinate;
    }

    public int getX2Coordinate() {
        return x2Coordinate;
    }

    public void setX2Coordinate(int x2Coordinate) {
        if (Double.compare(area(),0) !=0) {
            System.out.println("points are on the same line");
            return;
        }
        this.x2Coordinate = x2Coordinate;
    }

    public int getY2Coordinate() {
        return y2Coordinate;
    }

    public void setY2Coordinate(int y2Coordinate) {
        if (Double.compare(area(),0) !=0) {
            System.out.println("points are on the same line");
            return;
        }
        this.y2Coordinate = y2Coordinate;
    }

    public int getX3Coordinate() {
        return x3Coordinate;
    }

    public void setX3Coordinate(int x3Coordinate) {
        if (Double.compare(area(),0) !=0) {
            System.out.println("points are on the same line");
            return;
        }
        this.x3Coordinate = x3Coordinate;
    }

    public int getY3Coordinate() {
        return y3Coordinate;
    }

    public void setY3Coordinate(int y3Coordinate) {
        if (Double.compare(area(),0) !=0) {
            System.out.println("points are on the same line");
            return;
        }
        this.y3Coordinate = y3Coordinate;
    }
}
