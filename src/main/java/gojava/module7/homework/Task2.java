package gojava.module7.homework;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.stream.Collectors;

public class Task2 {

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

        List<Order> ordersList = new ArrayList<>();
        ordersList.add(new Order(getPositiveRandId(), 1000, Currency.UAH, "Pen", "Office Supplies", users.get(0)));
        ordersList.add(new Order(getPositiveRandId(), 1500, Currency.USD, "Ruler", "Office Supplies", users.get(1)));
        ordersList.add(new Order(getPositiveRandId(), 1000, Currency.UAH, "Pencil", "Office Supplies", users.get(2)));
        ordersList.add(new Order(getPositiveRandId(), 1000, Currency.USD, "Notebook", "Office Supplies", users.get(3)));
        ordersList.add(new Order(getPositiveRandId(), 1000, Currency.UAH, "Ball", "Sport Store", users.get(4)));
        ordersList.add(new Order(getPositiveRandId(), 1800, Currency.USD, "Snowboard", "Sport Store", users.get(5)));
        ordersList.add(new Order(Integer.MAX_VALUE, 1200, Currency.UAH, "Skis", "Sport Store", users.get(6)));
        ordersList.add(new Order(getPositiveRandId(), 1700, Currency.UAH, "Pen", "Office Supplies", users.get(7)));
        ordersList.add(new Order(getPositiveRandId(), 1700, Currency.USD, "Pencil", "Office Supplies", users.get(8)));
        ordersList.add(new Order(Integer.MAX_VALUE, 1200, Currency.UAH, "Skis", "Sport Store", users.get(6)));

        System.out.println("Initial list:\n" + ordersList + "\n");
        //reversed sorting by order prices
        ordersList.sort(Comparator.comparing(Order::getPrice).reversed());
        System.out.println("Sorted by prices in descending order:\n" + ordersList + "\n");

        //sorting by order prices and by user cities
        ordersList.sort(Comparator.comparing(Order::getPrice)
            .thenComparing((order1, order2) -> order1.getUser().getCity().compareTo(order2.getUser().getCity())));
        System.out.println("Sorted by prices and user cities:\n" + ordersList + "\n");

        //sorting by Order itemName AND ShopIdentificator AND User city
        ordersList.sort(Comparator.comparing(Order::getItemName)
            .thenComparing(Order::getShopIdentificator)
            .thenComparing((order1, order2) -> order1.getUser().getCity().compareTo(order2.getUser().getCity()))
        );
        System.out.println("Sorted by item, shop ID and user city:\n" + ordersList + "\n");

        //remove duplicates
        List<Order> uniqueOrders = ordersList.stream()
            .distinct()
            .collect(Collectors.toList());
        System.out.println("Unique orders:\n" + uniqueOrders + "\n");

        //remove ordersList with price below 1500
        List<Order> highPriceOrders = ordersList.stream()
            .filter((order) -> order.getPrice() > 1500)
            .collect(Collectors.toList());
        System.out.println("Orders with prices above 1500:\n" + highPriceOrders + "\n");

        //split ordersList by currencies
        Map<Currency, List<Order>> ordersByCurrencies = ordersList.stream()
            .collect(Collectors.groupingBy(Order::getCurrency));
        System.out.println("Orders split by currencies:\n" + ordersByCurrencies + "\n");

        //split ordersList by cities
        Map<String, List<Order>> ordersByCities = ordersList.stream()
            .collect(Collectors.groupingBy((order) -> order.getUser().getCity()));
        System.out.println("Orders split by user cities:\n" + ordersByCities + "\n");
    }

    public static long getPositiveRandId() {
        long id = UUID.randomUUID().getMostSignificantBits();
        if (id < 0) {
            id = getPositiveRandId();
        }
        return id;
    }
}
