package gojava.module5.homework;

import java.util.List;

public interface Dao {

    Room save(Room room);

    boolean delete(Room room);

    Room update(Room room);

    Room findById(long id);

    List<Room> getAll();
}
