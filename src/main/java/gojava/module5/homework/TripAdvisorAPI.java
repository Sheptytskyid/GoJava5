package gojava.module5.homework;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.UUID;

public class TripAdvisorAPI extends AbstractAPI {

    private List<Room> rooms = new ArrayList<>();

    public TripAdvisorAPI() {
        rooms.add(new Room(getPositiveLongRandomId(), 850, 2, new Date(116, 11, 1), "Rubin", "Truskavets"));
        rooms.add(new Room(getPositiveLongRandomId(), 950, 3, new Date(116, 11, 3), "Cristal", "Truskavets"));
        rooms.add(new Room(getPositiveLongRandomId(), 1400, 3, new Date(116, 11, 14), "Ibis", "Kyiv"));
        rooms.add(new Room(getPositiveLongRandomId(), 1500, 4, new Date(116, 11, 16), "Intercontinental", "Kyiv"));
        rooms.add(new Room(getPositiveLongRandomId(), 1600, 4, new Date(116, 11, 18), "Mir", "Kyiv"));
    }

    @Override
    public List<Room> getAll() {
        return rooms;
    }
}
