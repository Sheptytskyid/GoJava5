package gojava.module5.homework;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public abstract class AbstractAPI implements API {

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        List<Room> listOfRoomsFound = new ArrayList<>(0);
        for (Room room : getAll()) {
            if (room.getPrice() == price
                    && room.getPersons() == persons
                    && room.getCityName().equals(city)
                    && room.getHotelName().equals(hotel)) {
                listOfRoomsFound.add(room);
            }
        }
        return listOfRoomsFound.toArray(new Room[listOfRoomsFound.size()]);
    }

    @Override
    public abstract Room[] getAll();

    public static long getPositiveLongRandomId() {
        long id = UUID.randomUUID().getMostSignificantBits();
        if (id < 0) {
            id = getPositiveLongRandomId();
        }
        return id;
    }
}
