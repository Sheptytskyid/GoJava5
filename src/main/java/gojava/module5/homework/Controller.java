package gojava.module5.homework;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Controller {

    private List<API> apis = new ArrayList<>();
    private DAOImpl dao = new DAOImpl();

    public Controller() {
        apis.add(new BookingComAPI());
        apis.add(new GoogleAPI());
        apis.add(new TripAdvisorAPI());
    }

    public List<Room> requestRooms(int price, int persons, String city, String hotel) {
        System.out.println("Requesting room...");
        List<Room> listOfRoomsRequested = new ArrayList();
        for (API api : apis) {
            listOfRoomsRequested.addAll(api.findRooms(price, persons, city, hotel));
        }
        System.out.println(listOfRoomsRequested.size()
                            + (listOfRoomsRequested.size() == 1 ? " room " : " rooms ")
                            + "found!");
        return listOfRoomsRequested;
    }

    public List<Room> check(API api1, API api2) {
        System.out.println("Checking for equal rooms in " + api1.getClass().getSimpleName()
                            + " and " + api2.getClass().getSimpleName());
        List<Room> listOfEqualRooms = new ArrayList();
        for (Room room1 : api1.getAll()) {
            for (Room room2 : api2.getAll()) {
                if (room1.equals(room2)) {
                    listOfEqualRooms.add(room1);
                    listOfEqualRooms.add(room2);
                }
            }
        }
        System.out.println(listOfEqualRooms.size() + " equal rooms found!");
        return listOfEqualRooms;
    }

    public List<API> getApis() {
        return apis;
    }

    public DAOImpl getDao() {
        return dao;
    }
}
