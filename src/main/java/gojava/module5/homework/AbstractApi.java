package gojava.module5.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public abstract class AbstractApi implements Api {

    @Override
    public List<Room> findRooms(int price, int persons, String city, String hotel) {
        List<Room> listOfRoomsFound = new ArrayList<>();
        for (Room room : getAll()) {
            if (room.getPrice() == price
                    && room.getPersons() == persons
                    && room.getCityName().equals(city)
                    && room.getHotelName().equals(hotel)) {
                listOfRoomsFound.add(room);
            }
        }
        return listOfRoomsFound;
    }


    public static long getPositiveLongRandomId() {
        long id = UUID.randomUUID().getMostSignificantBits();
        if (id < 0) {
            id = getPositiveLongRandomId();
        }
        return id;
    }
}
