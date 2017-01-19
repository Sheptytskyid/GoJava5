package gojava.module10.practice.task2;

import java.util.HashMap;
import java.util.Map;

public class UsePersonApp {

    public static final String FIRST_NAME = "firstName";
    public static final String SECOND_NAME = "secondName";
    public static final String EMAIL = "Email";

    public static void main(String[] args) {
        Map<String, String> requestParams = new HashMap<>();
        requestParams.put(FIRST_NAME, "Pavlo");
        requestParams.put(SECOND_NAME, "Some Name");
        requestParams.put(EMAIL, "some@mail.net");

        PersonController controller = new PersonController();
        try {
            controller.save(requestParams);
        } catch (Exception e) {
            e.printStackTrace();
        }

        String name = null;
        try {
            name = controller.findByEmail(requestParams);
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println("Result is " + name.equals("Pavlo"));
    }
}
