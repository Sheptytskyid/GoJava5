package module5.homework;

import java.util.*;

public class Controller {

    private API[] apis = {
            new BookingComAPI(),
            new GoogleAPI(),
            new TripAdvisorAPI()
    };

    private List<Room> myRoomsList = new ArrayList(0);
    private DAOImpl dao = new DAOImpl();


    public List<Room> requestRooms(int price, int persons, String city, String hotel) {
        System.out.println("Requesting room...");
        List<Room> listOfRoomsRequested = new ArrayList(0);
        for (API api : apis) {
            listOfRoomsRequested.addAll(Arrays.asList(api.findRooms(price, persons, city, hotel)));
        }
        System.out.println(listOfRoomsRequested.size()
                            + (listOfRoomsRequested.size() == 1 ? " room " : " rooms ")
                            + "found!");
        return listOfRoomsRequested;
    }

    public List<Room> check(API api1, API api2) {
        System.out.println("Checking for equal rooms in " + api1.getClass().getSimpleName()
                            + " and " + api2.getClass().getSimpleName());
        List<Room> listOfEqualRooms = new ArrayList(0);
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

    public API[] getApis() {
        return apis;
    }

    public void setApis(API[] apis) {
        this.apis = apis;
    }

    public DAOImpl getDao() {
        return dao;
    }

    public void setDao(DAOImpl dao) {
        this.dao = dao;
    }
}
