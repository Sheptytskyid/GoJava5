package gojava.module6.practice.task2;

public class ViewDemo {

    public static void main(String[] args) {
        Triangle triangle = new Triangle();
        Square square = new Square();

        triangle.show();
        triangle.show();
        triangle.hide();
        triangle.hide();
        triangle.hide();

        square.show();
        square.show();
        square.hide();
        square.hide();
        square.hide();
    }
}
