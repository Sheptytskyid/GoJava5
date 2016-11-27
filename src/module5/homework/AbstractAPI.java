package module5.homework;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractAPI implements API {

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        List listOfRoomsFound = new ArrayList(0);
        for (Room room : getAll()) {
            if (room.getPrice() == price
                    && room.getPersons() == persons
                    && room.getCityName().equals(city)
                    && room.getHotelName().equals(hotel)) {
                listOfRoomsFound.add(room);
            }
        }
        Room[] arrayOfRoomsFound = new Room[listOfRoomsFound.size()];
        listOfRoomsFound.toArray(arrayOfRoomsFound);
        return arrayOfRoomsFound;
    }

    @Override
    public abstract Room[] getAll();
}
