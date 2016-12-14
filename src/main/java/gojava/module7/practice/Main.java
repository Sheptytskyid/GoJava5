package gojava.module7.practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static List<User> users = new ArrayList<>(1000000);

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        fillUsers();
        long endTime = System.currentTimeMillis();
        System.out.println(endTime - startTime);

        users.sort(new UsersComparator().reversed());
        //printList(users);

        List<User> users2 = users.stream().filter(n -> n.getAge() > 21).collect(Collectors.toList());
        printList(users2);
        Collections.sort(users, User::compareTo);
    }


    public static void fillUsers() {
        for (int i = 0; i < 1000000; i++) {
            users.add(i, new User("Ivan" + i, "Melnyk" + i, i));
        }
    }

    public static void printList(List<User> list) {
        for (int i = 0; i < 50; i++) {
            System.out.println(list.get(i));
        }
    }
}
