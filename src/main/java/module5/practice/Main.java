package module5.practice;

import java.util.UUID;

public class Main {

    public static void main(String[] args) {

        User user1 = new User(UUID.randomUUID().getMostSignificantBits(), "User1");
        user1.setConnection1(Connection.getInstance());
    }
}
