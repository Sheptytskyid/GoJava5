package gojava.module5.homework;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Controller controller = new Controller();
        List<Room> roomsList = new ArrayList<>();

        roomsList.addAll(controller.requestRooms(1200, 4, "Bukovel", "Marina"));
        roomsList.addAll(controller.requestRooms(1600, 4, "Kyiv", "Mir"));
        roomsList.addAll(controller.requestRooms(950, 3, "Truskavets", "Cristal"));
        System.out.println("\nList of requested rooms:\n" + roomsList + "\n");

        System.out.println(controller.check(controller.getApis().get(0), controller.getApis().get(1)));
        System.out.println(controller.check(controller.getApis().get(1), controller.getApis().get(2)));
        System.out.println(controller.check(controller.getApis().get(2), controller.getApis().get(0)));

        System.out.println();
        controller.getDao().save(roomsList.get(0));
        controller.getDao().save(roomsList.get(1));
        controller.getDao().save(roomsList.get(2));
        controller.getDao().delete(roomsList.get(2));
        System.out.println("\nList of saved rooms:\n" + controller.getDao().getAll());
    }
}
