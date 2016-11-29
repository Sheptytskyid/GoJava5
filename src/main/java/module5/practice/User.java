package module5.practice;

public class User {

    private long id;
    private String name;
    private Connection connection1;

    public User(long id, String name) {
        this.id = id;
        this.name = name;
    }

    public void setConnection1(Connection connection1) {
        this.connection1 = connection1;
    }
}
