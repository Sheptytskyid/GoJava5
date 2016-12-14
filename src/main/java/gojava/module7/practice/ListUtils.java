package gojava.module7.practice;

import gojava.module7.homework.Currency;
import gojava.module7.homework.Order;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;


public class ListUtils {

    public static List<Order> removeDuplicates(List<Order> list) {
        Set<Order> set = new LinkedHashSet<>(list);
        List<Order> newList = new ArrayList<>(set);
        return newList;
    }

    public static List<Order> removeLowPriceOrders(List<Order> orders, int priceFloor) {
        List<Order> newList = new ArrayList<>(orders);
        Iterator<Order> iterator = newList.iterator();
        while (iterator.hasNext()) {
            Order item = iterator.next();
            if (item.getPrice() < priceFloor) {
                iterator.remove();
            }
        }
        return newList;
    }

    public static Map<Currency, List<Order>> splitOrdersByCurrencies(List<Order> orders) {
        Map<gojava.module7.homework.Currency, List<Order>> map = new HashMap<>();
        for (Order order : orders) {
            map.merge(order.getCurrency(), new ArrayList<Order>(Arrays.asList(order)), (type, entry) -> {
                entry = map.get(order.getCurrency());
                entry.add(order);
                return entry;
            });
        }
        return map;
    }

    public static Map<String, List<Order>> splitOrdersByCities(List<Order> orders) {
        Map<String, List<Order>> map = new HashMap<>();
        for (Order order : orders) {
            map.merge(order.getUser().getCity(), new ArrayList<Order>(Arrays.asList(order)), (type, entry) -> {
                entry = map.get(order.getUser().getCity());
                entry.add(order);
                return entry;
            });
        }
        return map;
    }

    public static boolean findOrdersByUsersLastName(List<Order> orders, String name) {
        boolean result = false;
        for (Order order : orders) {
            if (order.getUser().getLastName().equals(name)) {
                result = true;
            }
        }
        return result;
    }

    public static NavigableSet<Order> removeOrdersGivenCurrency(NavigableSet<Order> orders,
                                                                gojava.module7.homework.Currency currency) {
        NavigableSet<Order> newOrdersSet = new TreeSet<>(orders);
        Iterator<Order> iterator = newOrdersSet.iterator();
        while (iterator.hasNext()) {
            Order item = iterator.next();
            if (item.getCurrency().equals(gojava.module7.homework.Currency.USD)) {
                iterator.remove();
            }
        }
        return newOrdersSet;
    }

}
