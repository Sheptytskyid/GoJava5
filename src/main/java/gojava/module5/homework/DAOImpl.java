package gojava.module5.homework;

import java.util.*;

public class DAOImpl implements DAO {

    private List<Room> myRoomsList = new ArrayList(0);

    @Override
    public Room save(Room room) {
        System.out.println("Saving " + room);
        myRoomsList.add(room);
        return room;
    }

    @Override
    public boolean delete(Room room) {
        System.out.println("Deleting " + room);
        if (myRoomsList.contains(room)) {
            myRoomsList.remove(room);
            return true;
        }
        System.out.println("Error! Room not found!");
        return false;
    }

    @Override
    public Room update(Room room) {
        boolean roomFound = false;
        System.out.println("Updating " + room);
        Room foundRoom = findById(room.getId());
        if (foundRoom != null) {
            myRoomsList.remove(foundRoom);
            myRoomsList.add(room);
            roomFound = true;
        }
        if (!roomFound) {
            System.out.println("Error! Room not found!");
        }
        return room;
    }

    @Override
    public Room findById(long id) {
        System.out.println("Searching for room id: " + id);
        for (Room room : myRoomsList) {
            if (room.getId() == id) {
                return room;
            }
        }
        return null;
    }

    @Override
    public List<Room> getAll() {
        return myRoomsList;
    }
}
