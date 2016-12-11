package gojava.module5.homework;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

public class BookingComAPI extends AbstractAPI {

    private List<Room> rooms = new ArrayList<>();

    public BookingComAPI() {
        rooms.add(new Room(getPositiveLongRandomId(), 800, 2, new Date(116, 11, 0), "Heart o' The City", "Mega City"));
        rooms.add(new Room(getPositiveLongRandomId(), 900, 3, new Date(116, 11, 2), "Skilandhouse", "Bukovel"));
        rooms.add(new Room(getPositiveLongRandomId(), 1000, 3, new Date(116, 11, 4), "SkiXata", "Bukovel"));
        rooms.add(new Room(getPositiveLongRandomId(), 1200, 4, new Date(116, 11, 6), "Dovbushanka", "Bukovel"));
        rooms.add(new Room(getPositiveLongRandomId(), 1200, 4, new Date(116, 11, 8), "Marina", "Bukovel"));
    }

    @Override
    public List<Room> getAll() {
        return rooms;
    }
}
