package gojava.module3.practice;

public class TrianglesDemo {

    public static void main(String[] args) {

        Triangles triangle = new Triangles(1,2,3,4,5,6);

        System.out.println("Perimeter:" + triangle.perimeter());
        System.out.println("Area: " + triangle.area());
    }
}
