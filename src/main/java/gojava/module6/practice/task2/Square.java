package gojava.module6.practice.task2;

public final class Square extends View {

    private static int counter = 0;

    @Override
    public void show() {
        System.out.println("Showing Square");
        counter++;
    }

    @Override
    public void hide() {
        if (counter == 0) {
            System.out.println("Square already hidden");
            return;
        }
        System.out.println("Hiding Square");
        counter--;
    }
}
