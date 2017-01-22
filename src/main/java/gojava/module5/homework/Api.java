package gojava.module5.homework;

import java.util.List;

public interface Api {

    List<Room> findRooms(int price, int persons, String city, String hotel);

    List<Room> getAll();
}
