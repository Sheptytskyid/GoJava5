package gojava.module5.homework;

import java.util.Date;
import java.util.UUID;

public class BookingComAPI extends AbstractAPI {

    private Room[] rooms = new Room[5];

    public BookingComAPI() {
        rooms[0] = new Room(getPositiveLongRandomId(), 800, 2, new Date(116, 11, 0), "Heart o' The City", "Mega City");
        rooms[1] = new Room(getPositiveLongRandomId(), 900, 3, new Date(116, 11, 2), "Skilandhouse", "Bukovel");
        rooms[2] = new Room(getPositiveLongRandomId(), 1000, 3, new Date(116, 11, 4), "SkiXata", "Bukovel");
        rooms[3] = new Room(getPositiveLongRandomId(), 1200, 4, new Date(116, 11, 6), "Dovbushanka", "Bukovel");
        rooms[4] = new Room(getPositiveLongRandomId(), 1200, 4, new Date(116, 11, 8), "Marina", "Bukovel");
    }

    @Override
    public Room[] getAll() {
        return rooms;
    }
}
