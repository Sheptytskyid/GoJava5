package gojava.module7.homework;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.NavigableSet;
import java.util.TreeSet;
import java.util.UUID;

public class Main {

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
        ordersList.add(new Order(getPositiveRandId(), 900, Currency.UAH, "Pencil", "Office Supplies", users.get(2)));
        ordersList.add(new Order(getPositiveRandId(), 500, Currency.USD, "Notebook", "Office Supplies", users.get(3)));
        ordersList.add(new Order(getPositiveRandId(), 1600, Currency.UAH, "Ball", "Sport Store", users.get(4)));
        ordersList.add(new Order(getPositiveRandId(), 1800, Currency.USD, "Snowboard", "Sport Store", users.get(5)));
        ordersList.add(new Order(Integer.MAX_VALUE, 1200, Currency.UAH, "Skis", "Sport Store", users.get(6)));
        ordersList.add(new Order(getPositiveRandId(), 1700, Currency.UAH, "Pen", "Office Supplies", users.get(7)));
        ordersList.add(new Order(getPositiveRandId(), 1700, Currency.USD, "Pencil", "Office Supplies", users.get(8)));
        ordersList.add(new Order(Integer.MAX_VALUE, 1200, Currency.UAH, "Skis", "Sport Store", users.get(6)));

        //reversed sorting by order prices
        ordersList.sort(Comparator.comparing(Order::getPrice).reversed());
        //System.out.println(ordersList);

        //sorting by order pricing and by user cities
        ordersList.sort(Comparator.comparing(Order::getPrice)
            .thenComparing((order1, order2) -> order1.getUser().getCity().compareTo(order2.getUser().getCity())));
        //System.out.println(ordersList);

        //sorting by Order itemName AND ShopIdentificator AND User city
        ordersList.sort(Comparator.comparing(Order::getItemName)
            .thenComparing(Order::getShopIdentificator)
            .thenComparing((order1, order2) -> order1.getUser().getCity().compareTo(order2.getUser().getCity()))
        );
        //System.out.println(ordersList);

        //remove duplicates
        List<Order> uniqueOrders = ListUtils.removeDuplicates(ordersList);
        //System.out.println(uniqueOrders);

        //remove ordersList wth price below 1500
        List<Order> highPriceOrders = ListUtils.removeLowPriceOrders(ordersList, 1500);
        //System.out.println(highPriceOrders);

        //split ordersList by currencies
        Map<Currency, List<Order>> ordersByCurrencies = ListUtils.splitOrdersByCurrencies(ordersList);
        //System.out.println(ordersByCurrencies);

        //split ordersList by cities
        Map<String, List<Order>> ordersByCities;
        ordersByCities = ListUtils.splitOrdersByCities(ordersList);
        //System.out.println(ordersByCities);

        NavigableSet<Order> ordersSet = new TreeSet<>(ordersList);

        System.out.println(ordersSet);
        //find ordersList by user's Last Name
        boolean foundOrderbyName;
        foundOrderbyName = ListUtils.findOrdersByUsersLastName(ordersList, "Sheptytskyi");
        //System.out.println(foundOrderbyName);
        foundOrderbyName = ListUtils.findOrdersByUsersLastName(ordersList, "Petrov");
        //System.out.println(foundOrderbyName);

        //print order with highest price
        Order orderWthHighestPrice;
        orderWthHighestPrice = ordersSet.last();
        System.out.println(orderWthHighestPrice);

        //Delete orders with given Currency
        NavigableSet<Order> ordersWithNonUsdCurrency;
        ordersWithNonUsdCurrency = ListUtils.removeOrdersGivenCurrency(ordersSet, Currency.USD);
        System.out.println(ordersWithNonUsdCurrency);
    }

    public static long getPositiveRandId() {
        long id = UUID.randomUUID().getMostSignificantBits();
        if (id < 0) {
            id = getPositiveRandId();
        }
        return id;
    }
}
