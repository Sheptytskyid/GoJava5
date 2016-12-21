package gojava.module8.homework;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        UserDAO usersDB = new UserDAO();
        User testUser = new User(111L, "Test User 1");
        List<User> testUsersList = createListOfTestUsers();

        System.out.println("Initial Users DB:\n" + usersDB.getList() + "\n");
        usersDB.save(new User(123L, "Vlad Korzh"));
        System.out.println("User with ID#123: " + usersDB.get(123L) + "\n");
        usersDB.deleteById(123L);
        usersDB.save(testUser);
        usersDB.delete(testUser);
        usersDB.saveAll(testUsersList);
        usersDB.deleteAll(testUsersList);
        System.out.println("Users DB after manipulations:\n" + usersDB.getList());
    }

    public static List<User> createListOfTestUsers() {
        List<User> testUsers = new ArrayList<>();
        testUsers.add(new User(222L, "Test User 2"));
        testUsers.add(new User(333L, "Test User 3"));
        testUsers.add(new User(444L, "Test User 4"));
        return testUsers;
    }
}
