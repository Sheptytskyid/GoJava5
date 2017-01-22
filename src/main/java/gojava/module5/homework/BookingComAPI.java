package gojava.module5.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class BookingComAPI extends AbstractAPI {

    private List<Room> rooms = new ArrayList<>();

    public BookingComAPI() {
        rooms.add(new Room(getPositiveLongRandomId(), 800, 2, LocalDate.now(), "Heart o' The City", "Mega City"));
        rooms.add(new Room(getPositiveLongRandomId(), 900, 3, LocalDate.of(2000, 1, 3), "Skilandhouse", "Bukovel"));
        rooms.add(new Room(getPositiveLongRandomId(), 1000, 3, LocalDate.of(2001, 2, 3), "SkiXata", "Bukovel"));
        rooms.add(new Room(getPositiveLongRandomId(), 1200, 4, LocalDate.of(2001, 11, 6), "Dovbushanka", "Bukovel"));
        rooms.add(new Room(getPositiveLongRandomId(), 1200, 4, LocalDate.of(2003, 11, 8), "Marina", "Bukovel"));
    }

    @Override
    public List<Room> getAll() {
        return rooms;
    }
}
