package gojava.module5.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class GoogleAPI extends AbstractAPI {

    private List<Room> rooms = new ArrayList<>();

    public GoogleAPI() {
        rooms.add(new Room(getPositiveLongRandomId(), 850, 2, LocalDate.of(2001, 11, 1), "Rubin", "Truskavets"));
        rooms.add(new Room(getPositiveLongRandomId(), 950, 3, LocalDate.of(2002, 11, 3), "Cristal", "Truskavets"));
        rooms.add(new Room(getPositiveLongRandomId(), 1000, 3, LocalDate.of(2001, 11, 4), "SkiXata", "Bukovel"));
        rooms.add(new Room(getPositiveLongRandomId(), 1200, 4, LocalDate.of(2001, 11, 6), "Dovbushanka", "Bukovel"));
        rooms.add(new Room(getPositiveLongRandomId(), 1250, 4, LocalDate.of(2001, 11, 9), "Villa Marina", "Truskavets"));
    }

    @Override
    public List<Room> getAll() {
        return rooms;
    }
}
