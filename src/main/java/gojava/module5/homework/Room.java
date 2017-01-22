package gojava.module5.homework;

import java.time.LocalDate;

public class Room {

    private long id;
    private int price;
    private int persons;
    private LocalDate dateAvailableFrom;
    private String hotelName;
    private String cityName;

    public Room(long id, int price, int persons, LocalDate dateAvailableFrom, String hotelName, String cityName) {
        this.id = id;
        this.price = price;
        this.persons = persons;
        this.dateAvailableFrom = dateAvailableFrom;
        this.hotelName = hotelName;
        this.cityName = cityName;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        Room room = (Room) obj;
        if (price != room.price) {
            return false;
        }
        if (persons != room.persons) {
            return false;
        }
        return cityName.equals(room.cityName);
    }

    @Override
    public int hashCode() {
        int result = price;
        result = 31 * result + persons;
        result = 31 * result + cityName.hashCode();
        return result;
    }

    @Override
    public String toString() {
        return "Room{"
                + "id=" + id
                + ", price=" + price
                + ", persons=" + persons
                + ", dateAvailableFrom=" + dateAvailableFrom
                + ", hotelName='" + hotelName + '\''
                + ", cityName='" + cityName + '\''
                + '}';
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getPersons() {
        return persons;
    }

    public void setPersons(int persons) {
        this.persons = persons;
    }

    public LocalDate getDateAvailableFrom() {
        return dateAvailableFrom;
    }

    public void setDateAvailableFrom(LocalDate dateAvailableFrom) {
        this.dateAvailableFrom = dateAvailableFrom;
    }

    public String getHotelName() {
        return hotelName;
    }

    public void setHotelName(String hotelName) {
        this.hotelName = hotelName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }
}
