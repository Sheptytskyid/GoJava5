package gojava.module8.practice;

public class UseShapes {

    public static void main(String[] args) {

        Point startPoint = new Point(6, 7);
        Rectangle rectangle1 = new Rectangle(startPoint, 14, 7);
        Rectangle rectangle2 = new Rectangle(startPoint, 1, 5);
        Rectangle rectangle3 = new Rectangle(startPoint, 4, 4);
        Square square = new Square(startPoint, 14);
        Circle circle = new Circle(startPoint, 14);

        Group<Shape> shapes = new Group<>();
        shapes.add(rectangle1);
        shapes.add(rectangle2);
        shapes.add(rectangle3);
        shapes.add(circle);

        shapes.getAll().forEach(System.out::println);
    }
}
