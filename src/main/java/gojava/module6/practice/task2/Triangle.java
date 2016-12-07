package gojava.module6.practice.task2;

public final class Triangle extends View {

    private boolean isShown = false;

    @Override
    public void show() {
        if (!isShown) {
            System.out.println("Showing Triangle");
            isShown = true;
        } else {
            System.out.println("Triangle already shown");
        }
    }

    @Override
    public void hide() {
        if (isShown) {
            System.out.println("Hiding Triangle");
            isShown = false;
        } else {
            System.out.println("Triangle already hidden");
        }
    }
}
