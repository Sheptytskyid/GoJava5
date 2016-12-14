package gojava.module7.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.NavigableSet;
import java.util.TreeSet;

import static gojava.module7.homework.Task2.getPositiveRandId;

public class Task3 {

    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User(getPositiveRandId(), "Denys", "Sheptytskyi", "Kyiv", 1000));
        users.add(new User(getPositiveRandId(), "Roman", "Syroyizhka", "Lviv", 1100));
        users.add(new User(getPositiveRandId(), "Vasyl", "Kozak", "Ternopil", 1200));
        users.add(new User(getPositiveRandId(), "Orest", "Melnyk", "Kyiv", 1300));
        users.add(new User(getPositiveRandId(), "Dmytro", "Kozak", "Lviv", 1400));
        users.add(new User(getPositiveRandId(), "Petro", "Fedus", "Ternopil", 1500));
        users.add(new User(getPositiveRandId(), "Ivan", "Fedus", "Kyiv", 1600));
        users.add(new User(getPositiveRandId(), "Roman", "Kulish", "Lviv", 1700));
        users.add(new User(getPositiveRandId(), "Sergii", "Kryvonis", "Ternopil", 1800));
        users.add(new User(getPositiveRandId(), "Roman", "Demchuk", "Kyiv", 1900));

        NavigableSet<Order> ordersSet = new TreeSet<>();
        ordersSet.add(new Order(getPositiveRandId(), 1000, Currency.UAH, "Pen", "Office Supplies", users.get(0)));
        ordersSet.add(new Order(getPositiveRandId(), 1500, Currency.USD, "Ruler", "Office Supplies", users.get(1)));
        ordersSet.add(new Order(getPositiveRandId(), 900, Currency.UAH, "Pencil", "Office Supplies", users.get(2)));
        ordersSet.add(new Order(getPositiveRandId(), 500, Currency.USD, "Notebook", "Office Supplies", users.get(3)));
        ordersSet.add(new Order(getPositiveRandId(), 1600, Currency.UAH, "Ball", "Sport Store", users.get(4)));
        ordersSet.add(new Order(getPositiveRandId(), 1800, Currency.USD, "Snowboard", "Sport Store", users.get(5)));
        ordersSet.add(new Order(Integer.MAX_VALUE, 1200, Currency.UAH, "Skis", "Sport Store", users.get(6)));
        ordersSet.add(new Order(getPositiveRandId(), 1700, Currency.UAH, "Pen", "Office Supplies", users.get(7)));
        ordersSet.add(new Order(getPositiveRandId(), 1700, Currency.USD, "Pencil", "Office Supplies", users.get(8)));
        ordersSet.add(new Order(Integer.MAX_VALUE, 1200, Currency.UAH, "Skis", "Sport Store", users.get(6)));

        System.out.println("Initial set:\n" + ordersSet + "\n");

        //find ordersList by user's Last Name
        boolean foundOrderbyName = ordersSet.stream()
            .anyMatch(order -> order.getUser().getLastName().equals("Sheptytskyi"));
        System.out.println("Set contains \"Sheptytskyi\": " + foundOrderbyName + "\n");

        //print order with highest price
        Order orderWthHighestPrice = ordersSet.last();
        System.out.println("Order with the highest price:\n" + orderWthHighestPrice + "\n");

        //Delete orders with given Currency
        ordersSet.removeIf((order) -> order.getCurrency().equals(Currency.USD));
        System.out.println("UAH Orders:\n" + ordersSet);

    }

}
