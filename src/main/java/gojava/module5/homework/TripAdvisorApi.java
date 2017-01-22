package gojava.module5.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TripAdvisorApi extends AbstractApi {

    private List<Room> rooms = new ArrayList<>();

    public TripAdvisorApi() {
        rooms.add(new Room(getPositiveLongRandomId(), 850, 2, LocalDate.of(2001, 11, 1), "Rubin", "Truskavets"));
        rooms.add(new Room(getPositiveLongRandomId(), 950, 3, LocalDate.of(2001, 11, 3), "Cristal", "Truskavets"));
        rooms.add(new Room(getPositiveLongRandomId(), 1400, 3, LocalDate.of(2001, 11, 14), "Ibis", "Kyiv"));
        rooms.add(new Room(getPositiveLongRandomId(), 1500, 4, LocalDate.of(2001, 11, 16), "Intercontinental", "Kyiv"));
        rooms.add(new Room(getPositiveLongRandomId(), 1600, 4, LocalDate.of(2001, 11, 18), "Mir", "Kyiv"));
    }

    @Override
    public List<Room> getAll() {
        return rooms;
    }
}
