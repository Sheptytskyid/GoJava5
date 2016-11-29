package gojava.module3.homework.task3_1;

public class Bird {

    public static void main(String[] args) {
        Bird obj = new Bird();
        String[] actions = {"walking", "flying", "singing", obj.getClass().getSimpleName()};

        for (int i = 0; i < actions.length; i++) {
            sing(actions[i]);
        }
    }

    static void sing(String action) {
        System.out.println("I am " + action);
    }
}
