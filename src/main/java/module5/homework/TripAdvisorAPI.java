package module5.homework;

import java.util.Date;
import java.util.UUID;

public class TripAdvisorAPI extends AbstractAPI {

    private Room[] rooms = new Room[5];

    public TripAdvisorAPI() {
        rooms[0] = new Room(UUID.randomUUID().getMostSignificantBits(), 850, 2,
                            new Date(116, 11, 1), "Rubin", "Truskavets");
        rooms[1] = new Room(UUID.randomUUID().getMostSignificantBits(), 950, 3,
                            new Date(116, 11, 3), "Cristal", "Truskavets");
        rooms[2] = new Room(UUID.randomUUID().getMostSignificantBits(), 1400, 3,
                            new Date(116, 11, 14), "Ibis", "Kyiv");
        rooms[3] = new Room(UUID.randomUUID().getMostSignificantBits(), 1500, 4,
                            new Date(116, 11, 16), "Intercontinental", "Kyiv");
        rooms[4] = new Room(UUID.randomUUID().getMostSignificantBits(), 1600, 4,
                            new Date(116, 11, 18), "Mir", "Kyiv");
    }

    @Override
    public Room[] getAll() {
        return rooms;
    }
}
