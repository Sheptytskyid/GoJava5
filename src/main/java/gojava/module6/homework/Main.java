package gojava.module6.homework;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        User[] users = {
            new User(1, "Roman", "Malysh", 1200, 1000),
            new User(1, "Roman", "Malysh", 1200, 1000),
            new User(User.getPositiveLongRandomId(), "Ivan", "Klym", 900, 100),
            new User(User.getPositiveLongRandomId(), "Petro", "Sivach", 1000, 700),
            new User(2, "Vasyl", "Kozak", 200, 1300),
            new User(User.getPositiveLongRandomId(), "Orest", "Bobak", 1000, 1000),
            new User(2, "Vasyl", "Kozak", 200, 1300),
            new User(2, "Vasyl", "Kozak", 200, 1300),
        };

        System.out.println("Users' IDs:\n" + Arrays.toString(UserUtils.getUsersId(users)));
        User[] uniqueUsers = UserUtils.uniqueUsers(users);
        System.out.println("Unique users:\n" + Arrays.toString(uniqueUsers));
        System.out.println("Users with balance of 1000:\n"
                + Arrays.toString(UserUtils.usersWithConditionalBalance(uniqueUsers, 1000)));
        System.out.println("Paying salaries...\n" + Arrays.toString(UserUtils.paySalaryToUsers(uniqueUsers)));
    }
}
