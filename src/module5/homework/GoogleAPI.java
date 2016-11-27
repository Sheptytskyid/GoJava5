package module5.homework;

import java.util.Date;
import java.util.UUID;

public class GoogleAPI extends AbstractAPI {

    private Room[] rooms = new Room[5];

    public GoogleAPI() {
        rooms[0] = new Room(UUID.randomUUID().getMostSignificantBits(), 850, 2,
                            new Date(116, 11, 1), "Rubin", "Truskavets");
        rooms[1] = new Room(UUID.randomUUID().getMostSignificantBits(), 950, 3,
                            new Date(116, 11, 3), "Cristal", "Truskavets");
        rooms[2] = new Room(UUID.randomUUID().getMostSignificantBits(), 1000, 3,
                            new Date(116, 11, 4), "SkiXata", "Bukovel");
        rooms[3] = new Room(UUID.randomUUID().getMostSignificantBits(), 1200, 4,
                            new Date(116, 11, 6), "Dovbushanka", "Bukovel");
        rooms[4] = new Room(UUID.randomUUID().getMostSignificantBits(), 1250, 4,
                            new Date(116, 11, 9), "Villa Marina", "Truskavets");
    }

    @Override
    public Room[] getAll() {
        return rooms;
    }
}
